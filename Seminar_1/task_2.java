// Вывести все простые числа от 1 до 1000
package Seminar_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[1000];
        List<Integer> res = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count ++;
        }
        
        for (int j = 0; j < arr.length; j++) {
            res.add(arr[j]);
        }
        System.out.println(res);
    }
}
