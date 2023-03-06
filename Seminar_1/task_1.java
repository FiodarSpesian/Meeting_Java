/**
        Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
        Ввод:5
        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
        n! 1 * 2 * 3 * 4 * 5 = 120
        */

package Seminar_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введмте число: ");
        int n = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= n; i++) {
            res = res + i;
        }
        System.out.println("Треугольное число: " + res);

        res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println("n!" + n + ": " + res);
        sc.close();
    }
}
