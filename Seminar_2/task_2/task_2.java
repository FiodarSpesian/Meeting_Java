/* 
2. Задание
Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
package Seminar_2.task_2;

import java.io.File;
import java.io.FileReader;

public class task_2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        
        try {
            String pathProject = System.getProperty("Meeting_Java.dir");
            String pathFile = pathProject.concat("/task_2.txt");
            File file = new File(pathFile);
            System.out.println("try");
            FileReader f1 = new FileReader(file);
            char[] a = new char[(int)file.length()];
            System.out.println(a);
            f1.close();
        } catch (Exception e) {
            System.out.println("catch" + e);
            
        }    
    }
}
