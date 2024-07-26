

/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes*/


package com.chainsys.codingchallenges;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
       String reverseA="";
       char ch;
       for(int i=0;i<A.length();i++){
           ch=A.charAt(i);
           reverseA=ch+reverseA;
       }
        
        if(reverseA.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
