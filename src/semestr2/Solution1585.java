package semestr2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Solution1585{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();

      Map<String, Integer> pinguins = new HashMap<>();

      pinguins.put("Emperor Penguin",0);
      pinguins.put("Little Penguin",0);
      pinguins.put("Macaroni Penguin",0);

      input.nextLine();

      for(int i =0; i<n; i++){
         String species = input.nextLine();
         pinguins.compute(species, (_, v)->v+1);
      }

      Map.Entry<String, Integer> m = Collections.max(
          pinguins.entrySet(),
          Map.Entry.comparingByValue());

        System.out.println(m.getKey());}}
