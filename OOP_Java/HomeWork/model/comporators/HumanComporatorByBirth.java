package OOP_Java.HomeWork.model.comporators;

import java.util.Comparator;

import OOP_Java.HomeWork.model.human.Human;

public class HumanComporatorByBirth implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
            return o1.getBirthDay().compareTo(o2.getBirthDay());
    }
    
}
