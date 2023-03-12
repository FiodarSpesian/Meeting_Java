/*
1. Задание
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
результат после каждой итерации (после перемещения числа) запишите в лог-файл.
1:38:00 по семинару
 */

package Seminar_2.task_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {
    public static void main(String[] args) throws IOException{
        Integer[] arr = {2, 5, 9, 7, 3, 8, 4, 6, 1};
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("Seminar_2/task_1/log_task_1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            logger.info(Arrays.toString(arr));
        }
    }
}
