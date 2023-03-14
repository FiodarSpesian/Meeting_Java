package Examples.Seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    /*
    Реализовать консольное приложение, которое:
    1. Принимает от пользователя и "запоминает" строки.
    2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.(Stack)
    3. stop - Заканчивает работу программы
     */
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while(true){
            String n = iscan.nextLine();
            if(n.equals("stop")){
                System.out.println("End of the program.");
                iscan.close();
                break;
            }
            else {
                if(n.equals("print")){
                    while (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                }
                else{
                    stack.push(n);
                }
            }
        }
    }
}
