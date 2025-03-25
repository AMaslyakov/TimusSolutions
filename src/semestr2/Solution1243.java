package semestr2;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution1243 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String big_number = input.nextLine();

        BigInteger number = new BigInteger(big_number);
        BigInteger reminder = number.mod(new BigInteger("7"));
        System.out.println(reminder);
    }
}
