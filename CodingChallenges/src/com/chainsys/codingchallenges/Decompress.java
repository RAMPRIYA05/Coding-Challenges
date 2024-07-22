package com.chainsys.codingchallenges;
import java.util.Scanner;
public class Decompress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a compressed word:");
		String S=sc.nextLine();
		String N=decompress(S);
		System.out.println("Decompressed:"+N);
	}
	public static String decompress(String S) {
		StringBuilder word=new StringBuilder();
		int i=0;
		 while (i < S.length()) {
	            char currentChar = S.charAt(i);
	            i++;
	            if (i < S.length() && Character.isDigit(S.charAt(i))) {
	                int repeatCount = Character.getNumericValue(S.charAt(i));
	                for (int j = 0; j < repeatCount; j++) {
	                    word.append(currentChar);
	                }
	                i++;
	            } else {
	                word.append(currentChar);
	            }
	        }
	        return word.toString();		
	}
}
