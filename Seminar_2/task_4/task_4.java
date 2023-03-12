/*
3* Задание(дополнительно). 
К калькулятору из Seminar_1 добавить логирование.
 */

package Seminar_2.task_4;

import java.io.FileWriter;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите знак операции +, -, *, /: ");
        char z = sc.next().charAt(0);
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        int res;
        if(z == '+') {
            res = a + b;
            writeToFile(a, b, z, res);
        }
        if(z == '-') {
            res = a - b;
            writeToFile(a, b, z, res);
        }
        if(z == '*') {
            res = a * b;
            writeToFile(a, b, z, res);
        }
        try {
            if(z == '/') {
                res = a / b;
                writeToFile(a, b, z, res);
            }
        } catch (Exception e) {
            System.out.println("На 0 делить нельзя.");
        }
        sc.close();
    }


    public static void writeToFile(int n1, int n2, char z, int res) {
        String str = new String(n1 + " " + z + " " + n2 + " = " + res);
        try(FileWriter fw = new FileWriter("Seminar_2/task_4/log_task_4.txt", true)) {
            fw.write(str);
            fw.write("\n");
            fw.close();
        }
        catch(Exception e) {
            System.out.println("Exception.");
        }
    }


}
