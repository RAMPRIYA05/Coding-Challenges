package com.chainsys.codingchallenges;
import java.util.Scanner;

public class AverageNum {
static int average;
	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n:");
     int n=sc.nextInt();
     int[] num=new int[n];
    
     
     for(int i=0;i<num.length;i++) {
    	 num[i]=sc.nextInt();
    	 
     }
     System.out.println("K:");
     int k=sc.nextInt();
     
      double number=0;
      
     for(int i=0;i<k;i++) {
    	 number=number+num[i];
     	 
     }
     double maxNumber=number;
    
     for(int i=k;i<num.length;i++) {
    	 maxNumber=maxNumber+num[i]-num[i-k];
    	 number=Math.max(maxNumber, number);
     }
     
     double averageNumber=number/k;
     System.out.println(averageNumber);
     
	}

}
