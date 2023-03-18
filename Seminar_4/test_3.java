package Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) throws Exception {
        System.out.println("\nВас приветствует калькулятор!\nЗдесь можно делать следующие действия с числами:\n");
        System.out.println(" 1.Складывать(+)\n 2.Отнимать(-)\n 3.Умножать(*)\n 4.Делить(/)");
        System.out.println(" 5.Отменять последнее действие(Отмена)\n 6.Выйти из программы(Выход).\n");
        Deque<Integer> dq = new ArrayDeque<>();
        Integer res = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        Integer a = sc.nextInt();
        while(true){
            System.out.print("Введите операцию +, -, *, /, Отмена, Выход: ");
            String c = sc.nextLine();
            String z = sc.nextLine();
            if(stop(z) == true) break;
            if(cancel(z) == true){
                dq.removeLast();
                a = dq.getLast();
                System.out.println("Результат: " + a);
                System.out.print("Введите операцию +, -, *, /, Отмена, Выход: ");
                z = sc.nextLine();
            }
            System.out.print("Введите второе число: ");
            Integer b = sc.nextInt();

            res = calculation(a, z, b);
            System.out.println( "Результат: " + res);
            dq.addLast(res);
            System.out.println("Очередь: " + dq);
            a = res;
        }
    }

    public static boolean stop(String z) {
        boolean flag = false;
        if(z.toLowerCase().equals("выход")) {
            flag = true;
        }
        return flag;
    }

    public static boolean cancel(String z) {
        boolean flag = false;
        if(z.toLowerCase().equals("отмена")) {
            flag = true;
        }
        return flag;
    }

    public static Integer calculation(Integer a, String z, Integer b) {
        Integer res = 0;
        if(z.equals("+")) {
            res = a + b;
        }
        if(z.equals("-")) {
           res = a - b;
        }
        if(z.equals("*")) {
            res = a * b;
        }
        try {
           if(z.equals("/")) {
            res = a / b;
            }
        } catch (Exception e) {
        System.out.println("На 0 делить нельзя.");
        }
        return res;
    }
}
