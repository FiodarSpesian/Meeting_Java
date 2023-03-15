package Seminar_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class task_1 {
    /*
    1. Задание.
    Пусть дан LinkedList с несколькими элементами. 
    Реализуйте метод(не void), который вернет “перевернутый” список.
     */
    public static void main(String[] args) {
        System.out.println("Ваш массив:");
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("null", "1", "2", "3"));
        System.out.println(ll);
        System.out.println("Новый массив:");
        System.out.println(ListToReverse(ll));
    }

    
    public static LinkedList ListToReverse(LinkedList arr) {
        Stack stack = new Stack<>();
        LinkedList nll = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++) {
            stack.push(arr.get(i));
        }
        while(!stack.isEmpty()) {
            nll.add(stack.pop());
        }
        return nll;
    }
}
