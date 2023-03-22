package Seminar_5;
/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
                 2) Вывод всего 
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
           2) Вывод всего 
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
           2) Вывод всего 
Я: 2
Иванов: 1242353, 547568
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("\n Телефонная книга.\n Введите число:");
        Map<String,LinkedList> phB = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(" 1 Для добавления записи. \n 2 Для вывода содержимого.");
            Integer num = sc.nextInt();
            if (num == 1) fillPhonBook(phB, sc);
            if (num == 2) outAll(phB);
        }
    }

    public static Map fillPhonBook( Map<String,LinkedList> ponBk,Scanner scan) {
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Введите ФИО: ");
        String fio = scan.next();
        System.out.println("Введите номер: ");
        String phon = scan.next();
        if(ponBk.containsKey(fio) == false){
            ll.add(phon);
            ponBk.put(fio, ll);
        } else {
            ponBk.get(fio).add(phon);
        }
        return ponBk;
    }
    public static void outAll(Map<String,LinkedList> ponBk) {
        Iterator<String> itr = ponBk.keySet().iterator();
        String key = new String();
        while(itr.hasNext()){
            key = itr.next();
            System.out.println(key + ":" + ponBk.get(key));
        }
    }
}