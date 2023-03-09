/*
1. Задание
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
результат после каждой итерации (после перемещения числа) запишите в лог-файл.
1:38:00 по семинару
 */

package Seminar_2.task_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 5, 9, 7, 3, 8, 4, 6, 1};
        String name_file = "task_1.txt";
        File file = new File(name_file);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            try(FileWriter fw = new FileWriter(file, true)) {
                fw.write(Arrays.toString(arr));
                fw.write("\n");
                fw.close();
            }
            catch(IOException e) {
                System.out.println("Exception.");
            }
            //System.out.println(Arrays.toString(arr));
            //System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));
    }
    
}
