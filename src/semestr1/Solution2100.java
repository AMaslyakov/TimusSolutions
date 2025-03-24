package semestr1;

import java.util.Scanner;

public class Solution2100 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int invites = input.nextInt();
    String guest;
    int guest_count = invites + 2;
    for (int i = 0; i < invites; i++) {
      guest = input.next();
      if (guest.contains("+one")) {
        guest_count++;
      }}
    if(guest_count == 13){guest_count++;}
    System.out.println(guest_count*100);
  }}

