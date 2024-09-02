package com.chainsys.codingchallenges;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Enter the number:");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        int largest = number[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] < largest) {
                secondLargest = number[i];
            }
        }
        System.out.println("Second Largest number:"+secondLargest);
    }
}
