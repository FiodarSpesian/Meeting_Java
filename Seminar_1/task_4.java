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
        System.out.println("Enter expression with '?' by the number: ");
        String exp = sc.nextLine();
        String[] ast = exp.split("");
        System.out.println(Arrays.toString(ast));
        sc.close();
        for (int i = 0; i < ast.length; i++) {
            if(ast[i] == "?"){
                System.out.println(i);    
            }
        }
    }
}