package OOP_Java.HomeWork.model.tree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.human.HumanIterator;
import OOP_Java.HomeWork.model.service.TreeService;

public class Tree<T extends Human> extends TreeService implements Serializable, Iterable<T>{
    private List<T> humanList;

    public Tree(){
        // super();
        this.humanList = new ArrayList<T>();
        // this(new ArrayList<>());
    }
    public void addHuman(T human) {
        this.humanList.add(human);
        if (human.getFather() != null) addChildToFatherChildrenList(human);
        if (human.getMother() != null) addChildToMotherChildrenList(human);

    }

    
    public void getChildren(T parent) {
        System.out.println("Parent:\n " + parent + "\nChildren: ");
        for (int i = 0; i < humanList.size(); i++) {
            if(humanList.get(i).getFather() == null|| humanList.get(i).getMother() == null){
                continue;
            }
            if(humanList.get(i).getFather().equals(parent) || humanList.get(i).getMother().equals(parent)){
                System.out.println(" " + humanList.get(i));
            }
        }
    }
    private void addChildToFatherChildrenList(T human) {
        human.getFather().addChild(human);
    }
    private void addChildToMotherChildrenList(T human) {
        human.getMother().addChild(human);
    }

    public void readTree(FileWorker obj) throws FileNotFoundException, IOException, ClassNotFoundException {
        obj.read();
    }
    public void saveTree(FileWorker obj) throws IOException {
        obj.save();    
    }

    @Override
    public String toString() {
        return humanList.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator<>(humanList);
    }

    // public void sortByName() {
    //     Collections.sort(this.getHumansList(), new HumanComporatorByName());
    //     // tree.getHumansList().sort(new HumanComporatorByName());
    // }
    // public void sortByBirthDay() {
    //     Collections.sort(this.getHumansList(), new HumanComporatorByBirth());
    //     // tree.getHumansList().sort(new HumanComporatorByBirth());
    // }

}
