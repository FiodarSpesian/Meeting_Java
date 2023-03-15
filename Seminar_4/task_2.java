package Seminar_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди, 
    dequeue() - возвращает первый элемент из очереди и удаляет его, 
    first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));
        //System.out.println(enqueue(ll));
        //System.out.println(dequeue(ll));
        //System.out.println(first(ll));
        System.out.println(ll);
    }
    public static LinkedList enqueue(LinkedList arr) {
        String st;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите значение, которое хотите добавить в очередь: ");
        st = sc1.nextLine();
        sc1.close();
        arr.add(st);
        return arr;
    }
    public static Object dequeue(LinkedList arr) {
        Object val = arr.get(0);
        arr.remove(0);
        return val ;
    }
    public static Object first(LinkedList arr) {
        Object val = arr.get(0);
        return val ;
    }
}
