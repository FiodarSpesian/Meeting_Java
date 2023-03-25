package Seminar_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество (Set) ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook
Например: “Введите цифру, соответствующую необходимому критерию: 
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Класс сделать в отдельном файле
приветствие 
Выбор параметра
выбор конкретнее
вывод подходящих
 */
public class main {
    public static void main(String[] args) throws IOException {

        // // Блок Кода для создания и добавления экземпляра класса в базу данных(dataBase.txt)

        // NoteBook comp1 = new NoteBook("2", 256, "Windows", "White");
        // comp1.writeToBase(comp1, "Seminar_6/dataBase.txt");
        // NoteBook comp2 = new NoteBook("4", 512, "Windows", "Black");
        // comp2.writeToBase(comp2, "Seminar_6/dataBase.txt");
        // NoteBook comp3 = new NoteBook("8", 1024, "Windows", "Red");
        // comp3.writeToBase(comp3, "Seminar_6/dataBase.txt");
        // NoteBook comp4 = new NoteBook("8", 512, "Linux", "Silver");
        // comp4.writeToBase(comp4, "Seminar_6/dataBase.txt");
        // NoteBook comp5 = new NoteBook("12", 256, "Linux", "Grey");
        // comp5.writeToBase(comp5, "Seminar_6/dataBase.txt");
        // NoteBook comp6 = new NoteBook("16", 1024, "Linux", "Black");
        // comp6.writeToBase(comp6, "Seminar_6/dataBase.txt");
        // NoteBook comp7 = new NoteBook("8", 512, "MacOS", "Silver");
        // comp7.writeToBase(comp7, "Seminar_6/dataBase.txt");
        // NoteBook comp8 = new NoteBook("8", 1024, "MacOS", "Gold");
        // comp8.writeToBase(comp8, "Seminar_6/dataBase.txt");
        // NoteBook comp9 = new NoteBook("16", 2048, "MacOS", "Grey");
        // comp9.writeToBase(comp9, "Seminar_6/dataBase.txt");

        // Блок для общения с покупателем
        BufferedReader br = new BufferedReader(new FileReader("Seminar_6/dataBase.txt"));
        LinkedList<String> shop = new LinkedList<>();
        String line;
        Set<String> ram = new HashSet<>();
        Set<String> ssd = new HashSet<>();
        Set<String> systemBy = new HashSet<>();
        Set<String> color = new HashSet<>();
        
        while((line = br.readLine())!= null) shop.add(line); // считывание данных из базы 
        for (int i = 0; i < shop.size(); i++) {
            ram.add(shop.get(i).split(" ")[0]); // запись данных в множество ОЗУ
            ssd.add(shop.get(i).split(" ")[1]); // запись данных в множество Объем ЖД
            systemBy.add(shop.get(i).split(" ")[2]); // запись данных в множество Операционная система
            color.add(shop.get(i).split(" ")[3]); // запись данных в множество Цвет
        }

        Map<String, Set<String>> character = new HashMap<>(); // создание словаря с ключами по характеристикам и списками по значениям  
        character.put("ОЗУ", ram);
        character.put("Объем ЖД", ssd);
        character.put("Операционная система", systemBy);
        character.put("Цвет", color);

        Scanner sc = new Scanner(System.in);
        System.out.println("Вас приветствует онлайн магазин ноутбуков.");
        System.out.println("Введите цифру параметра для фильтрации: "); 

        for (int i = 0; i < (character.keySet()).size(); i++) System.out.println( (i + 1) + " " + (character.keySet()).toArray()[i]); 
        int firstFilter = sc.nextInt();  // цикл for можно записать через Iterator iter = new Iterator и через цикл while  для Set !!!

        for (int i = 0; i < (character.keySet()).size(); i++) {
            //System.out.println(character.keySet().toArray()[i]);
            if (i == firstFilter - 1){
                Object setKeys = character.keySet().toArray()[i];
                //String sKeLen = (String) character.get(setKeys).toArray();
                for (int l = 0; l < character.get(setKeys).size(); l++) System.out.println((l + 1) + " " + character.get(setKeys).toArray()[l]);
                System.out.println("Введите цифру нужного параметра: ");
                int secondFilter = sc.nextInt();
                System.out.println("Вот что мы нашли по вашим парамеирам: ");
                for (int n = 0; n < character.get(setKeys).size(); n++) {
                    if (n == secondFilter - 1) {
                        String find = (String)character.get(setKeys).toArray()[n];
                        for (int j = 0; j < shop.size(); j++) {
                            String[] str = shop.get(j).split(" ");
                            for (int k = 0; k < str.length; k++) {
                                if (str[k].equals(find)) System.out.println(shop.get(j));
                            }
                        }
                    }
                }
            }
        }
        br.close();
        sc.close();
    }
}
