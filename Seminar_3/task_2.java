package Seminar_3;

import java.util.ArrayList;
import java.util.List;

// 2 Задание. Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task_2 {
    public static void main(String[] args) {
        List lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add((int)(Math.random()*10));
        }
        System.out.println(lst);

        for (int i = lst.size()-1; i >= 0; i--) {
            if((int)lst.get(i) % 2 == 0){
                lst.remove(i);
            }
        }
        System.out.println(lst);
    }
}
