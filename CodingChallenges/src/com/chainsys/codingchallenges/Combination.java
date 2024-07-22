package com.chainsys.codingchallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		System.out.println("Enter k:");
		int k=sc.nextInt();
		List<List<Integer>> combination=new ArrayList<>();
		validCombination(n,k,1,new ArrayList<>(), combination);
		System.out.println(k +"and"+ n);
		 for (List<Integer> combo : combination) {
	            System.out.println(combo);
	        }

	}
	
	public static void  validCombination(int n,int k,int start, List<Integer> number, List<List<Integer>> result) {
		
		
		if(number.size()==k) {
			int sum=0;
			for(int num:number) {
				sum=num+sum;
			}
			if(sum==n) {
				result.add(new ArrayList<>(number));
			}
			return;
		}
		 for (int i = start; i <= n; i++) {
	            number.add(i); 
	            validCombination(n, k, i + 1, number, result); 
	            number.remove(number.size() - 1); 
	        }
	}

}
