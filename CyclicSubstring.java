package com.rounak;

import java.util.Scanner;

public class CyclicSubstring {
    public static void main(String[] args) {
        System.out.print("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        String str = s + s;

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean[] used = new boolean[26];

            for (int j = i; j < i + n; j++) {
                char ch = str.charAt(j);

                if (used[ch - 'a']) {
                    break;
                }

                used[ch - 'a'] = true;
                sum += (ch - 'a' + 1);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.print("Max Sum : ");
        System.out.println(maxSum);
    }
}