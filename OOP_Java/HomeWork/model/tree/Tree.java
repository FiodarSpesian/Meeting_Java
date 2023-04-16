package OOP_Java.HomeWork.model.tree;

import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.model.human.Human;

public class Tree<T extends Human> extends ArrayList<Human> {
    public List<T> humanList;

    public Tree(){
        this.humanList = new ArrayList<T>();
    }
}
