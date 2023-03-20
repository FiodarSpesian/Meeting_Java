package Examples.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)

Пример 1:

Input: s = "foo", t = "bar"

Output: false

Пример 2:

Input: s = "paper", t = "title"

Output: true
*/
public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();
        input.close();
        System.out.println(isIsomorph(firstWord, secondWord, 1));
    }
    public static boolean isIsomorph(String firstWord, String secondWord, int flag) {
        if (firstWord.length() != secondWord.length()) return false;
        else{
            Map<Character,Character> newMap = new HashMap<>();
            for (int i = 0; i < firstWord.length(); i++) {
                if(newMap.containsKey(firstWord.charAt(i)) && secondWord.charAt(i) != newMap.get(firstWord.charAt(i))){
                    return false;
                }
                else {
                    newMap.put(firstWord.charAt(i), secondWord.charAt(i));
                }
            }
            if(flag == 1) return isIsomorph(secondWord, firstWord, 0);
            else return true;
        }
    }
}
