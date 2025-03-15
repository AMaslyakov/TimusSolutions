import java.util.Scanner;

public class Solution1005{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] weights = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        
        int m = findMinDifference(weights, n);
        System.out.println(m);
    }
    
    private static int findMinDifference(int[] weights, int n) {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }
        
        // Создаем массив для хранения возможных сумм
        boolean[] dp = new boolean[totalWeight + 1];
        dp[0] = true;
        
        // Заполняем массив dp
        for (int weight : weights) {
            for (int j = totalWeight; j >= weight; j--) {
                if (dp[j - weight]) {
                    dp[j] = true;
                }
            }
        }
        
        // Находим минимальную разность
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= totalWeight / 2; i++) {
            if (dp[i]) {
                minDiff = Math.min(minDiff, totalWeight - 2 * i);
            }
        }
        
        return minDiff;
    }
}
