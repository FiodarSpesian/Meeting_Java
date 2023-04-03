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
        Collections.sort(tree.getHumansList());
    }

    public void sortByBirthDay(){
        Collections.sort(tree.getHumansList());
        for (int i = 0; i < tree.getHumansList().size(); i++) {
            
        }
    }
}
