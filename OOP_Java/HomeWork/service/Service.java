package OOP_Java.HomeWork.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

import OOP_Java.HomeWork.tree.Tree;

public class Service {
    private Tree tree;
    public Service(Tree tree){
        this.tree = tree;
    }
    public void sortByName() {
        Collections.sort(tree.getHumansList(), new HumanComporatorByName());
        // tree.getHumansList().sort(new HumanComporatorByName());
    }

    public void sortByBirthDay(){
        Collections.sort(tree.getHumansList(), new HumanComporatorByBirth());
        // tree.getHumansList().sort(new HumanComporatorByBirth());
    }
}
