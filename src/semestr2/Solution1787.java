package semestr2;

import java.util.Scanner;


public class Solution1787{
    public static void main(String[] args){Scanner input = new Scanner(System.in);
   int k = input.nextInt();
   int n = input.nextInt();
   //int[] cars_on_min = new int[n];
   int diff = 0;
   for(int i=0; i<n; i++){
     int ai = input.nextInt();
     int tmp = ai + diff - k;
     if(tmp>0) diff = tmp;
     else diff = 0;
   }
    System.out.println(diff);
    }
}
