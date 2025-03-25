package semestr2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1545 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        List<String> sylabs = new ArrayList<>();
        for(int i=0; i<N; i++){
            sylabs.add(input.nextLine());
        }
        char letter = input.nextLine().charAt(0);
        sylabs.forEach(s->{
            if(s.charAt(0) == letter) System.out.println(s);
        });
    }
}
