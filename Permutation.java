package com.ctc.arrays;
import java.util.Arrays;
import java.util.Scanner;
//third program
public class Permutation {
	public static boolean isEqual(String str1, String str2) {
		if (str1.equals(str2))
			return true;
		return false;
	}

	public static String sort(String input) {
		char c[] = input.toCharArray();
		Arrays.sort(c);
		String result = new String(c);
		return result;

	}

	public static boolean isPermutation(String input1, String input2) {

		String sorted1 = sort(input1);
		String sorted2 = sort(input2);
		return isEqual(sorted1, sorted2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two inputs");
		String input1 = sc.next();
		String input2 = sc.next();
		boolean output = isPermutation(input1, input2);
		System.out.println(output);
		sc.close();
	}

}


