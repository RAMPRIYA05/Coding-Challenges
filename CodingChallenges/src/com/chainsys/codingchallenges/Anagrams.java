package com.chainsys.codingchallenges;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
       a=a.toLowerCase();
       b=b.toLowerCase();
       char[] a1=a.toCharArray();
       Arrays.sort(a1);
       
       char[] b1=b.toCharArray();
     Arrays.sort(b1);
     boolean word=false;
     String word1=new String(a1);
     String word2=new String(b1);
     if(word1.equals(word2)){
         word=true;
        
     }
    
     return word;
       
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}