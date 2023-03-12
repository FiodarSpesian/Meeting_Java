package Seminar_3;
// 3 Задание. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;

public class task_3 {
    public static void main(String[] args) {
        Integer min = 0;
        Integer max = 0;
        Integer medArif = 0;
        ArrayList<Integer> lst =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add((int)(Math.random()*10));
        }
        System.out.println(lst);
        for (int i = 0; i < lst.size(); i++) {
            if (lst(i) > max) max = lst[
        }
    }
}
