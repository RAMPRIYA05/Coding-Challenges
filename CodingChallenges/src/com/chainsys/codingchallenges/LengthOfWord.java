package com.chainsys.codingchallenges;

import java.util.Scanner;

public class LengthOfWord {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=sc.next();
		int length=0;
		int i=word.length()-1;
		while(i>=0 && word.charAt(i)==' ') {
			i--;
		}
		while(i>=0 && word.charAt(i)!=' ') {
			length++;
			i--;
		}
		System.out.println(length);
		
	}
	
}
