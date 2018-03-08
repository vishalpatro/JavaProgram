package com.ctc.arrays;
//hiiiiii
import java.util.Scanner;
//first program one
public class OneEdit {
	public static boolean isOneAway(String input1, String input2) {
		int length1 = input1.length();
		int length2 = input2.length();
		// if both the string length are equal then it has to be definitely
		// replace
		if (length1 == length2)
			return replace(input1, input2);
		int difference = Math.abs(length1 - length2);
		// as the difference in string must be one its checked here
		if (difference > 1)
			return false;
		// remove is inverse of insertion so same ideology is used
		if (length1 < length2)// insertion
			return modify(input1, input2);
		if (length1 > length2)// removal
			return modify(input2, input1);
		return false;
	}

	public static boolean modify(String input1, String input2) {
		int ahead = 0;
		for (int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i);
			char c2 = input2.charAt(i + ahead);
			// if there is at mismatch at more than one place then error
			if (c1 != c2) {
				if (c1 != (input2.charAt(i + 1)))
					return false;
				else {
					ahead++;
				}
			}

		}
		return true;
	}

	public static boolean replace(String input1, String input2) {
		int count = 0;
		// it is checking that if mismatch occurs at greater than two character
		// positions
		// then there is no one edit away
		for (int i = 0; i < input1.length(); i++) {
			char c = input1.charAt(i);
			char d = input2.charAt(i);
			if (c != d)
				count++;
		}
		if (count <= 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getting the inputs
		System.out.println("Enter the inputs");
		String input1 = sc.next();
		String input2 = sc.next();
		boolean output = isOneAway(input1, input2);
		System.out.println(output);
	}

}
