package OOP_Java.HomeWork.model.service.commands;

import java.util.Scanner;

import OOP_Java.HomeWork.model.human.Gender;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.tree.Tree;

public class FactoryHuman extends Human {
    Tree<Human> tree;
    Scanner sc;
    String name;
    String surname;
    String gender;
    String calendar;
    
    public FactoryHuman(String name, String surname, String gender, String calendar){
        super();
        sc = new Scanner(System.in);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.calendar = calendar; 
    }
    public FactoryHuman(){
        this(null, null, null, null);
    }
    public Human createHuman() {
        Human human = new Human();
        System.out.println("Enter name:");
        human.setName(sc.nextLine());
        System.out.println("Enter surname:");
        human.setSurname(sc.nextLine());
        System.out.println("Enter gender Male/Female:");
        gender = sc.nextLine();
        if(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")){
            if(gender.toLowerCase().equals("male")){
                human.setGender(Gender.Male);
            } else{
                human.setGender(Gender.Female);
            }
        } else {
            System.out.println("Wrong gender!");
        }
        System.out.println("Enter birthday format dd.mm.yyyy:");
        calendar = sc.nextLine();
        human.setDayOfBirth(calendar);
        System.out.println(human);
        return human;
    }
}
