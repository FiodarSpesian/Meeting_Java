package OOP_Java.HomeWork.human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Human implements Serializable, Comparable<Human>{
    private List<Human> children;
    private String name;
    private String surname;
    private Gender gender;
    private BirthDay birthDay;
    private Human father;
    private Human mother;
    
    public Human( String name, String surname, Gender gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDay = new BirthDay(dayOfBirth, monthOfBirth, yearOfBirth);
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }
    public Human(String name, String surname, Gender gender, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this(name, surname, gender, dayOfBirth, monthOfBirth, yearOfBirth, null, null);
    }
    
    public void addChild(Human child){
        if (!children.contains(child)){
            children.add(child);
        }
    }
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("FIO: ");
        sb.append(name);
        sb.append(" ");
        sb.append(surname);
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }
    public String getFatherInfo() {
        String res = "father: ";
        if (mother != null){
            res += father.getName();
        } else{
            res += "unknown";
        }
        return res;
    }
    public String getMotherInfo() {
        String res = "mother: ";
        if (mother != null){
            res += mother.getName();
        } else{
            res += "unknown";
        }
        return res;
    }
    public String getChildrenInfo() {
        StringBuilder res = new StringBuilder();
        res.append("children: ");
        if (children.size() != 0){
            // res.append(children.get(0).getName());
            for (int i = 0; i < children.size(); i++) {
                // res.append(", ");
                res.append(children.get(i).getName());
                res.append(" ");
            }
        } else {
            res.append("childfree");
        }
        return res.toString();
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

    public Calendar getBirthDay(){
        return birthDay.getHappyBirthDay();
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
        return name + " " + surname + " " + gender + " " + birthDay;
    }
    @Override
    public int compareTo(Human o) {
        return getName().compareTo(o.getName());
    }
}
