package OOP_Java.HomeWork.model.human;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthDay {
    private Calendar happyBD;
    private int dayOfBirth;
    private int monthOfBirth; 
    private int yearOfBirth;
    public BirthDay(int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.happyBD = new GregorianCalendar(yearOfBirth, monthOfBirth, dayOfBirth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dayOfBirth);
        sb.append(".");
        sb.append(monthOfBirth);
        sb.append(".");
        sb.append(yearOfBirth);
        return sb.toString();
    }
    public Calendar getHappyBirthDay() {
        return happyBD;
    }
    // public int compareTo(Human o) {
    //     return getHappyBirthDay().compareTo(o.getBirthDay().getHappyBirthDay());
    // }
}
