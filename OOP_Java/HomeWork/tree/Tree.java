package OOP_Java.HomeWork.tree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.fileWorker.FileWorker;
import OOP_Java.HomeWork.human.Human;

public class Tree implements Serializable{
    private List<Human> humanList;    
    public Tree(){
        this(new ArrayList<>());
    }

    private Tree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public void addHuman(Human human) {
        this.humanList.add(human);
        if (human.getFather() != null) addChildToFatherChildrenList(human);
        if (human.getMother() != null) addChildToMotherChildrenList(human);

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
    public void saveTree(FileWorker obj) throws FileNotFoundException, IOException {
        obj.save();
    }
    public void readTree(FileWorker obj) throws FileNotFoundException, IOException, ClassNotFoundException {
        obj.read();
    }

    private void addChildToFatherChildrenList(Human human) {
        human.getFather().addChild(human);
    }
    private void addChildToMotherChildrenList(Human human) {
        human.getMother().addChild(human);
    }
    @Override
    public String toString() {
        return humanList.toString();
    }
}
