package semestr2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1496 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String[] members = new String[N];
        for(int i =0; i<N; i++){members[i] = input.nextLine();}
        Map<String, Integer> submits = new HashMap<>();
        for(String m: members){
            if(!submits.containsKey(m)){submits.put(m, 1);}
            else{submits.replace(m, submits.get(m),
                                 submits.get(m) + 1);}}
        submits.forEach((k,v)->{
            if(v>1)System.out.println(k);});
    }}
