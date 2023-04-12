package OOP_Java.HomeWork.model.human;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;


public class Human implements Serializable, Comparable<Human>{
    private List<Human> children;
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
        children = new ArrayList<>();
    }
    public Human(String name, String surname, Gender gender, String daybirth){
        this(name, surname, gender, daybirth, null, null);
    }
    public Human(){
        this(null, null, null, null);
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
    private String getFatherInfo() {
        String res = "father: ";
        if (mother != null){
            res += father.getName();
        } else{
            res += "unknown";
        }
        return res;
    }
    private String getMotherInfo() {
        String res = "mother: ";
        if (mother != null){
            res += mother.getName();
        } else{
            res += "unknown";
        }
        return res;
    }
    private String getChildrenInfo() {
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
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
   
    public void setDayOfBirth(String birthDay) {
        this.birthDay = birthDay;
    }
    public Calendar getBirthDay(){
        Calendar calBirthDay = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        try {
            calBirthDay.setTime(sdf.parse(birthDay));
        } catch (ParseException e) {
            System.out.println("error.");
        }
        return calBirthDay;
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
