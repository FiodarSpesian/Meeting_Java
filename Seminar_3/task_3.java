package Seminar_3;
// 3 Задание. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        Integer min = 0;
        Integer max = 0;
        Integer medArif = 0;
        ArrayList<Integer> lst =  new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            lst.add((int)(Math.random()*10));
        }
        System.out.println(lst);
        min = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) max = lst.get(i);
            if (lst.get(i) < min) min = lst.get(i);
            medArif = medArif + lst.get(i);
        }
        System.out.println("Max value of array: " + max);
        System.out.println("Min value of array: " + min);
        System.out.println("Sum of values of array: " +medArif);
        System.out.println("Average value of array: " + (medArif/lst.size()));
    }
}
