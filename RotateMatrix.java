package com.ctc.arrays;
//rotate matrix
import java.util.Scanner;

public class RotateMatrix {
	static int a[][];

	public static boolean isRotateMatrix(int[][] a) {
		if (a.length != 0 && a.length != a[0].length) {// checking if row and
														// col are equal so that
														// it is square
			return false;
		}
		for (int layer = 0; layer < a.length / 2; layer++) {// layer is taking
															// the outer inner
															// and soon
			int first = layer;
			int last = a.length - 1 - layer;
			for (int i = first; i < last; i++) {// traversing through the
												// elements by index
				int offset = i - first;
				int top = a[first][i];// copy top
				a[first][i] = a[last - offset][first];// set top to left
				a[last - offset][first] = a[last][last - offset];// set left to
																	// bottom
				a[last][last - offset] = a[i][last];// set bottom to right
				a[i][last] = top;// set right as top
			}

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of matrix: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		a = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		boolean output = isRotateMatrix(a);
		if (output) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("enter the correct matrix");

	}

}
