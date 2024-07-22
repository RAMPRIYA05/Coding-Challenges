package com.chainsys.codingchallenges;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrix={{ 1,  2,  3,  4,  5 },{ 6,  7,  8,  9, 10 },{ 11, 12, 13, 14, 15 },{ 16, 17, 18, 19, 20 },{ 21, 22, 23, 24, 25 }};
		int search=sc.nextInt();
		boolean findNumber= searchNumber(matrix, search);
		System.out.println("Find Number in the matrix:"+findNumber);
		
	}

    public static boolean searchNumber(int[][] matrix, int search) {
    	 if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
             return false;
         }   	 
    	 int row = matrix.length;
         int col = matrix[0].length;
         int row1 = 0;
         int col1 = col - 1;
         while (row1 < row && col1 >= 0) {
             if (matrix[row1][col1] == search) {
                 return true; 
             } else if (matrix[row1][col1] < search) {
                 row1++; 
             } else {
                 col1--;
             }
         }	 
		return false;
    }
}

