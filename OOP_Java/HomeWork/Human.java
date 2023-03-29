package OOP_Java.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private List children;
    private String name;
    private String surname;
    private Gender gender;
    private String birthDay;
    private Human father;
    private Human mother;
    
    public Human( String name, String surname, Gender gender, String birthDay, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDay = birthDay;
        this.father = father;
        this.mother = mother;
    }
    public Human(String name, String surname, Gender gender, String birthDay){
        this(name, surname, gender, birthDay, null, null);
    }
    public Human(){
        this(null, null, null, null, null, null);
    }
    public void addChild(Human child){
        this.children = new ArrayList<Human>();
        children.add(child);
    }
    public List<Human> getChildren(){
        return this.children;
    }
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Gender getGender(){
        return gender;
    }

    public String getBirthDay(){
        return birthDay;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "\n"+ name + " " + surname + " " + gender + " " + birthDay + "\nfather: " + this.father + "\nmother: " + this.mother;
    }
}
