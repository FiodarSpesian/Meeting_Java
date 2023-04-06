package OOP_Java.HomeWork.service;

import java.util.Comparator;

import OOP_Java.HomeWork.human.Human;

public class HumanComporatorByName implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
