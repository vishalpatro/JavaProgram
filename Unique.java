package com.ctc.arrays;
//unique
import java.util.Scanner;

public class Unique {
	public static boolean isUnique(String input) {
		boolean b[] = new boolean[256];
		// checking for empty string
		if (input.length() == 0)
			return false;
		// iterating through the string
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int val = (int) c;
			// converting the character into its ascii value and thus
			// in the first occurrence it will changed to true
			if (!b[val]) {
				b[val] = true;
			} else
				// therfore in the second occurence it will return flase
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.next();
		boolean output = isUnique(input);
		System.out.println(output);
	}
}
