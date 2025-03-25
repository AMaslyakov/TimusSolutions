package semestr2;

import java.util.*;
import java.util.stream.Collectors;


public class Solution1567 {

    public static List<List<Character>> keyboard = new ArrayList<>();

    static {
        keyboard.add(Collections.unmodifiableList(Arrays.asList('a', 'b', 'c')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('d', 'e', 'f')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('g', 'h', 'i')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('j', 'k', 'l')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('m', 'n', 'o')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('p', 'q', 'r')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('s', 't', 'u')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('v', 'w', 'x')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('y', 'z')));
        keyboard.add(Collections.unmodifiableList(Arrays.asList('.', ',', '!')));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String spam = input.nextLine();
        int press_count = 0;
        for(char letter: spam.toCharArray()){
            if(letter == ' '){
                press_count++;
                continue;
            }
            List<Character> button = keyboard.stream()
                    .filter(l->l.contains(letter))
                    .collect(Collectors.toList()).get(0);
            press_count += button.indexOf(letter) + 1;
        }
        System.out.println(press_count);
    }
}
