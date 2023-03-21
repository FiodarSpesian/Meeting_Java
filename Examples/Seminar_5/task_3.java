package Examples.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    /*
    Написать программу, определяющую правильность расстановки скобок в выражении.

    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String text = input.nextLine();
        input.close();
        System.out.println(isTrue(text));
    }
    public static boolean isTrue(String text){
        Map<Character,Character> vocabulary = new HashMap<>();
        vocabulary.put(')', '(');
        vocabulary.put(']', '[');
        vocabulary.put('}', '{');
        Stack<Character> newStack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if(vocabulary.containsValue(text.charAt(i))) {
                newStack.push(text.charAt(i));
            }
            if(vocabulary.containsKey(text.charAt(i))) {
                if (newStack.isEmpty() || vocabulary.get(text.charAt(i)) != newStack.pop()) return false;
            }
        }
        return newStack.isEmpty();
    }
}
