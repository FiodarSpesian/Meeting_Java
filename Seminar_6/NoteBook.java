package Seminar_6;

import java.io.FileWriter;
import java.io.IOException;

/*
seminar 6
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество (Set) ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

приветствие 
Выбор параметра
выбор конкретнее
вывод подходящих

Например: “Введите цифру, соответствующую необходимому критерию: 
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести подходящие по условиям.
Класс сделать в отдельном файле.

 */
public class NoteBook {
    public String RAM;
    public Integer SSD;
    public String systemBy;
    public String color;

    public NoteBook(String RAM, Integer SSD, String systemBy, String color) {
        this.RAM = RAM;
        this.SSD = SSD;
        this.systemBy = systemBy;
        this.color = color; 
    }


    public void print(){
        System.out.printf("Features: RAM - %s, SSD - %d, Supervisor - %s, Color - %s.", this.RAM, this.SSD, this.systemBy, this.color);
    }


    public String stringForBase() {
        String str = this.RAM + " " + this.SSD + " " + this.systemBy + " " + this.color + "\n";
        return str;
    }


    public void writeToBase(NoteBook comp, String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            fw.write(comp.stringForBase());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Exception.. : (");
        }
    }
}
