package com.ctc.arrays;
//string compression
import java.util.Scanner;

public class StringCompression {
	public static String compressString(String input) {
		String out = "";
		int val = input.charAt(0);
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			int currentVal = input.charAt(i);
			if (val == currentVal)
				count++;
			else {
				out = out + input.charAt(i - 1);
				out = out + count;
				count = 1;
				val = input.charAt(i);
			}
		}
		out = out + input.charAt(input.length() - 1);
		out = out + (count);
		return input.length() < out.length() ? input : out;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		String input = sc.next();
		String output = compressString(input);
		System.out.println(output);
	}

}
