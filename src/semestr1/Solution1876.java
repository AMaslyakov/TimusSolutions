package semestr1;

import java.util.Scanner;

public class Solution1876 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int worse = Math.max(
            2*b + 40,
            2*a + 39
    );
    System.out.println(worse);
  }}
