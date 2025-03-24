package semestr2;

import java.util.Scanner;

public class Solution1005{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] weights = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = input.nextInt();
        }
        
        int m = findMinDifference(weights, n);
        System.out.println(m);
    }
    
    private static int findMinDifference(int[] weights, int n) {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }
        
        boolean[] dp = new boolean[totalWeight + 1];
        dp[0] = true;
        
        for (int weight : weights) {
            for (int j = totalWeight; j >= weight; j--) {
                if (dp[j - weight]) {
                    dp[j] = true;
                }
            }
        }
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= totalWeight / 2; i++) {
            if (dp[i]) {
                minDiff = Math.min(minDiff, totalWeight - 2 * i);
            }
        }
        
        return minDiff;
    }
}
