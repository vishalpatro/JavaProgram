package com.ctc.arrays;

import java.util.Scanner;
//second program
public class PalindromePermutation {

	public static boolean isOddCount(int arr[]) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				if (flag)
					return false;
				flag = true;
			}
		}
		return true;
	}

	public static int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (val >= a && val <= z) {
			return val - a;
		}
		return -1;
	}

	public static int[] buildCharFrequency(String input) {
		char str[] = input.toCharArray();
		int arr[] = new int[Character.getNumericValue('z')
				- Character.getNumericValue('a') + 1];

		for (char c : str) {
			int val = getCharNumber(c);

			if (val != -1)
				arr[val]++;
		}
		return arr;

	}

	public static boolean isPermutationAPalindrome(String input) {
		int a[] = buildCharFrequency(input);
		return isOddCount(a);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.next();
		System.out.println("the string permutation is a palindrome:"
				+ isPermutationAPalindrome(input));

	}

}
