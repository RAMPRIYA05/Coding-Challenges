package com.chainsys.codingchallenges;

public class TransposeMatrix {

	public static void main(String[] args) {
		int rows, cols;
		int a[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		rows = a.length;
		cols = a[0].length;
		int transpose[][] = new int[cols][rows];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				transpose[i][j] = a[j][i];
			}
		}
		System.out.println("Transpose of matrix a: ");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
