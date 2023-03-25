package Seminar_5.task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
Пусть дан список сотрудников:
["Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", 
 "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"]
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности Имени.
 */
public class task_2 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> eml = new LinkedList<>();
        LinkedList<String> name = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader("Seminar_5/task_2/employ_data.txt"));
        String line;
        while((line = br.readLine()) != null) eml.add(line);
        br.close();
        for (String wor : eml) name.add(wor.split(" ")[0]);
        name.sort(Comparator.naturalOrder());
        eml.clear();
        int count = 1;
        for (int i = 1; i < name.size(); i++) {
            if(name.get(i - 1).equals(name.get(i)))count++;
            else{
                eml.add(count + "-" + name.get(i-1));
                count = 1;
            }
        }
        eml.sort(Comparator.reverseOrder());
        for (int i = 0; i < eml.size(); i++) {
            System.out.println(Arrays.asList(eml.get(i)));
        }
    }
}
