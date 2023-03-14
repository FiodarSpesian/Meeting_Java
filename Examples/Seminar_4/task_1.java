package Examples.Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_1 {
    // проверка времени заполнения ArrayList и LinkedList 100000 элементами
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linked_list = new LinkedList<>();
        long time_start_al = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //list.add(i);
            list.add(i, 0);
        }
        long time_end_al = System.currentTimeMillis();
        long time_al = time_end_al - time_start_al;
        System.out.println(time_al);
        long time_start_ll = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //linked_list.add(i);
            linked_list.add(i, 0);
        }
        long time_end_ll = System.currentTimeMillis();
        long time_ll = time_end_ll - time_start_ll;
        System.out.println(time_ll);
    }
}