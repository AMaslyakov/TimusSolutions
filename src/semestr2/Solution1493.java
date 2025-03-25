package semestr2;

import java.util.Scanner;

public class Solution1493 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ticket_number = input.nextLine();

        int all = Integer.parseInt(ticket_number);

        int all_1 = all - 1;
        int all_2 = all + 1;

        if(isHappy(all_1) || isHappy(all_2)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static boolean isHappy(int number){
        String str_number = String.valueOf(number);

        if(!isSizeSix(str_number)){
            while (str_number.length() < 6){
                str_number = String.format("0%s", str_number);
            }}

        char[] numbers = str_number.toCharArray();

        int left_sum = Integer.parseInt(String.valueOf(numbers[0])) +
                       Integer.parseInt(String.valueOf(numbers[1]))+
                       Integer.parseInt(String.valueOf(numbers[2]));

        int right_sum = Integer.parseInt(String.valueOf(numbers[3])) +
                        Integer.parseInt(String.valueOf(numbers[4]))+
                        Integer.parseInt(String.valueOf(numbers[5]));

        return left_sum == right_sum;
    }

    public static boolean isSizeSix(String number){
        return number.length() == 6;
    }
}
