package com.chainsys.codingchallenges;

import java.util.Scanner;

public class CommonTable {

	public static void main(String[] args) {
		int[][] number = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
		int count = 0;
		int rows = number.length;
		int col = number[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				boolean isEqual = true;
				for (int k = 0; k < rows; k++) {
					if (number[i][k] != number[k][j]) {
						isEqual=false;
						break;
					}

				}
				if (isEqual) {
					count++;
				}
			}
		}
		System.out.println("count:" + count);

	}

}
