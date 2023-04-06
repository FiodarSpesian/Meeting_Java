package OOP_Java.HomeWork.service;

import java.util.Collections;

import OOP_Java.HomeWork.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.comporators.HumanComporatorByBirth;
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
