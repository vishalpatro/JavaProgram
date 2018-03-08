package com.ctc.arrays;
//urilify
import java.util.Scanner;

public class Urlify {
	public static String urlFy(String input, int trueLength) {
		char d[] = input.toCharArray();
		int spaceCount = 0;
		for (char a : d) {
			if (a == ' ')
				spaceCount++;
		}
		int index = trueLength + spaceCount * 2;
		char c[]=new char[index];
		System.arraycopy(d,0,c,0,d.length);
		if (trueLength < c.length) {
			c[trueLength] = '\0';
		}
		for (int i = trueLength-1; i >= 0; i--) {
			if (c[i] == ' ') {
				c[index - 1] = '0';
				c[index - 2] = '2';
				c[index - 3] = '%';
				index = index - 3;
			} else {
				c[index - 1] = c[i];
				index--;
			}
		}
		return new String(c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string and the true length");
		String input = sc.nextLine();
		int trueLength = sc.nextInt();
		String output = urlFy(input, trueLength);
		System.out.println("the urlify string: " + output);
	}

}
