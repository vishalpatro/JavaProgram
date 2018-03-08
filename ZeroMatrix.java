package com.ctc.arrays;
//zeromatrix
import java.util.Scanner;

public class ZeroMatrix {
	/*
	 * public static void computeZeroMatrix(int[][] a, int rows, int cols) { int
	 * b[][]=new int[rows][cols]; for(int i=0;i<rows;i++){ for(int
	 * j=0;j<cols;j++){ if(a[i][j]!=0) b[i][j]=a[i][j]; else{ for(int
	 * k=0;k<cols;k++) b[i][k]=0; for(int l=0;l<rows;l++) b[l][j]=0; }
	 * 
	 * }
	 * 
	 * } }
	 */
	// inefficient because once we have assigned all the zeroes,, again these
	// zeroes will be changed in the consecutive rows and cols
	// to prevent these we need to use flag the location at which is changed
	// which will result in additional iteration
	// so we find the zeroth locations first and then nullify rows and columns
	public static int[][] computeZeroMatrix(int[][] a, int rows, int cols) {
		boolean row[] = new boolean[rows];
		boolean col[] = new boolean[cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		a = findRows(row, a);
		a = findCols(col, a);
		return a;
	}

	public static int[][] findRows(boolean[] row, int a[][]) {

		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				a = nullifyrows(a, i);

			}
		}
		return a;

	}

	public static int[][] nullifyrows(int[][] a, int i) {

		for (int k = 0; k < a[i].length; k++) {
			a[i][k] = 0;
		}
		return a;

	}

	public static int[][] findCols(boolean[] col, int a[][]) {
		for (int i = 0; i < col.length; i++) {
			if (col[i])
				a = nullifycols(a, i);
		}
		return a;
	}

	public static int[][] nullifycols(int[][] a, int i) {
		for (int k = 0; k < a.length; k++) {
			a[k][i] = 0;
		}
		return a;
	}

	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of matrix");
		System.out.println("Enter the coloumns of matrix");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.println("enter the elements of the matrix");
		int a[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		a = computeZeroMatrix(a, rows, cols);
		print(a);

	}

}
