package semestr1;

import java.util.Scanner;
import java.util.ArrayList;

public class Solution1001 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> r = new ArrayList<String>();
    while(true){
      if (input.hasNextLong()){
        Double t = Math.sqrt(input.nextLong());
        r.add(String.format("%.4f", t));
      } else
          break;}
    for(int i=r.size() - 1;i>=0;i--){
      System.out.println(r.get(i));}
  }}