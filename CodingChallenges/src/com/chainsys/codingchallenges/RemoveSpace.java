package com.chainsys.codingchallenges;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
       A = A.replaceAll("\\s+", "");    
        
        System.out.println(" Sentence with out spaces: " + A);  

	}

}
