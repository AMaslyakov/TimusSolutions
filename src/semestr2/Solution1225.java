package semestr2;

import java.util.Scanner;

public class Solution1225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        long[] dp = new long[N + 2];

        dp[0] = 2; 
        dp[1] = 2; 

        for (int i = 2; i < N+2; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.println(dp[N-1]);
    }
}

