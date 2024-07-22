package com.chainsys.codingchallenges;

import java.util.Scanner;

public class MinimumWindow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S="ADOBECODEBANC";
		String T="ABC";
		System.out.println(minwindow(S, T));
	}

	public static String minwindow(String s, String t) {

        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
		
		int[] tcount=new int[256];
		int[] windowCount=new int[256];
		int letter=t.length();
		int minWindowLength=Integer.MAX_VALUE;
		int minWindowStart=0;
		int minWindowEnd=0;
		for(char c:t.toCharArray()) {
			tcount[c]++;
		}
		int letter1=0;
		int letter2=0;
		int letter3=0;
		
		while(letter1<s.length())
		{
			char letters=s.charAt(letter1);
			windowCount[letters]++;
			
			
			if (windowCount[letters] <= tcount[letters]) {
	             letter3++;
	         }
			
		
		 while (letter3 == letter && letter2<= letter1) {
			 int windowLength = letter1 - letter2 + 1;
             if (windowLength < minWindowLength) {
                 minWindowLength = windowLength;
                 minWindowStart = letter2;
                 minWindowEnd = letter1;
             }
             
             
             char leftChar = s.charAt(letter2);
             windowCount[leftChar]--;
             
             if (windowCount[leftChar] < tcount[leftChar]) {
            	 letter3--;
             }
             
             letter2++;
		 
		 }
		 letter1++;
	}
	
	if(minWindowLength==Integer.MAX_VALUE)

	{
		return "";
		
	}
	else
	{
		return s.substring(minWindowStart, minWindowEnd + 1);
		
	}
	
}
}

	




