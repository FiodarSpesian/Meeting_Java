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

import java.io.BufferedReader;
import java.io.FileReader;

public class task_2 {
    public static void main(String[] args)     {
        String sourse = "Seminar_2/task_2/task_2.txt";
        String[] gradeTable;
        StringBuilder sb = new StringBuilder ();

        try (BufferedReader reader = new BufferedReader (new FileReader(sourse))){
            String line;
            while ((line = reader.readLine()) != null) {
            gradeTable = line.replace( "\"", "").split ( ":|,");
            sb.append("\nСтудент ").append(gradeTable[1]).append(" получил ") 
              .append(gradeTable[3]).append(" по предмету ").append(gradeTable[5]);
            }
            System.out.println(sb);
        }
        catch(Exception e){
            e.printStackTrace();
        }  
    }
}
