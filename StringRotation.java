package com.ctc.arrays;
//rotate string
import java.util.Scanner;

public class StringRotation {
	public static int isSubString(String s1, String s2) {
		return s1.indexOf(s2);
	}

	public static boolean isStringRotation(String s1, String s2) {
		if (s1.length() == s2.length() && s1.length() > 0) {
			// waterbottle is rotated as erbottlewat so it is a part of
			// waterbottlewaterbottle
			String s3 = s1 + s1;
			if ((isSubString(s3, s2)) >= 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings to check for rotation");
		String s1 = sc.next();
		String s2 = sc.next();
		boolean output = isStringRotation(s1, s2);
		System.out.println("The second string is substring of first string: "
				+ output);
	}

}
