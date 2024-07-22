package com.chainsys.codingchallenges;

import java.util.Arrays;
import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
	    int[] A=new int[n];
		int[] B= new int[n];
		System.out.println("Array A:");
		for(int i=0;i<A.length;i++) {
	    	 A[i]=sc.nextInt();
	    	 
	     }
		System.out.println("Array B:");
		for(int j=0;j<B.length;j++)
		{
			B[j]=sc.nextInt();	
		}
		int[] C=new int[A.length+B.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<A.length && j<B.length) {
			if(A[i]<=B[j]) {
				C[k++]=A[i++];
			}
			else {
				C[k++]=B[j++];
			}
			
		}
	    while(i<A.length) {
			C[k++]=A[i++];
		}
		while(j<B.length)
		{
			C[k++]=B[j++];
		}
       
		
		for(i=0;i<C.length;i++) {
			System.out.println(C[i]);
			
	}
		Arrays.sort(C);
		
		System.out.println(Arrays.toString(C));
		
	

}
}
