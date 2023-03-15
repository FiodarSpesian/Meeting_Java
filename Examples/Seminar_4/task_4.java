package Examples.Seminar_4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class task_4 {
    /*
    Написать метод, который принимает на вход массив и записывает его в стэк.
    Выводит содержимое стека.
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("null", "gjjhf", "1", "2", "3"));
        Stack<String> stack = new Stack<>();
        for (String string : str) {
            stack.push(string);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    
}
