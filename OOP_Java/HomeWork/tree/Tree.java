package OOP_Java.HomeWork.tree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.human.Human;

public class Tree implements Serializable {
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
    public void save(String file) throws FileNotFoundException, IOException {
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(file));
        // for (int i = 0; i < humanList.size(); i++) {
        //     outStream.writeObject(humanList.get(i));
        // }
        outStream.writeObject(humanList);
        outStream.close();
    }
    public void readTree(String file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream( file));
        List<Human>newhumanList = (List<Human>) inputStream.readObject();
        System.out.println(newhumanList);
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
