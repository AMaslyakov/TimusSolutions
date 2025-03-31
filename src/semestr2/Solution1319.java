package semestr2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1319{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] shells = new int[N][N];

        int num = 1;
        int row, col;
        for(int i=0; i<N*N; i++){
            if(i<N){row=0;
                   col=i;
            }else { col = N - 1;
                    row = i - N + 1;}

            while (row < N && col >= 0) {
                    shells[row][col] = num;
                    num++;
                    row++;
                    col--;}
            }

            Arrays.stream(shells).forEach(a->{
                for(int i=a.length-1; i>=0; i--){
                    System.out.print(a[i] + " ");}
                System.out.print("\n");
            });
        }}

