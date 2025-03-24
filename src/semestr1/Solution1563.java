package semestr1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Solution1563 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    ArrayList<String> shops = new ArrayList<>();
    String line = input.nextLine();
    while (true) {
      if(input.hasNextLine()){
          line = input.nextLine().toLowerCase();
          shops.add(line);
    } else 
        break;}
    Set<String> set_shops =  new HashSet<>(shops);
    System.out.println(N - set_shops.size());}}