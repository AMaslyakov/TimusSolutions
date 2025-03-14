package semestr2;

import java.util.Scanner;

public class Solution1820{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int k = input.nextInt();
      int r;
      if(n <=k ) r = 2;
      else r = (int) Math.ceil((double) (2*n)/k);

      System.out.println(r);
    }
}
