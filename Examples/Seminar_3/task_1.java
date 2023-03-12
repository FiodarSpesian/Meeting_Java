package Examples.Seminar_3;
/*
Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
 */

import java.util.ArrayList;
import java.util.Comparator;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyList.add((int) (Math.random()*10));
        } 
        System.out.println(MyList);
        MyList.sort(Comparator.naturalOrder());
        System.err.println(MyList);
    }
}
