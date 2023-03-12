/**
(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь). 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69
 */

package Seminar_1;

import java.util.Arrays;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter equation like '2? + ?5 = 69': ");
        String equation = sc.nextLine (); //2? + ?5 = 69
        String message = "Решения нет!"; 
        for (int i = 0; i < 10; i++) {
            String result = equation. replace ("?", Integer. toString (i));
            // 20 + 05 = 69
            String[] arr = result. split( " ");
            if (Integer.parseInt(arr [0]) + Integer.parseInt (arr [2]) == Integer.parseInt (arr [4])){
                message = result;
            }
        }
        System.out.println(message);
    }
}
