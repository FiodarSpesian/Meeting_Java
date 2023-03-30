package OOP_Java.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Human> humanList;    
    public Tree(){
        this(new ArrayList<>());
    }

    private Tree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public void addHuman(Human human) {
        this.humanList.add(human);
    }

    public void getChildren(Human parent) {
        //List<Human> res = new ArrayList<>();
        System.out.println("Parent:\n " + parent + "\nChildren: ");
            for (int i = 0; i < humanList.size(); i++) {
                if(humanList.get(i).getFather() == null|| humanList.get(i).getMother() == null){
                    continue;
                }
                if(humanList.get(i).getFather().equals(parent) || humanList.get(i).getMother().equals(parent)){
                    //res.add(humanList.get(i));
                    System.out.println(" " + humanList.get(i));
                }
            }
        //return res;
    }
    public void saveToFile() {
        
    }
    public void readFromFile() {
        
    }
}
