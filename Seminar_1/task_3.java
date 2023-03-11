/**
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

package Seminar_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите знак операции +, -, *, /: ");
        char z = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        if(z == '+') System.out.print(a + b);
        if(z == '-') System.out.print(a - b);
        if(z == '*') System.out.print(a * b);
        try {
            if(z == '/') System.out.println(a / b);

        } catch (Exception e) {
            System.out.println("На 0 делить нельзя.");
        }
        sc.close();
    }
}
