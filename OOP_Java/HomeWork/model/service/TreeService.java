package OOP_Java.HomeWork.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.human.HumanIterator;
import OOP_Java.HomeWork.model.service.commands.FactoryHuman;
import OOP_Java.HomeWork.model.tree.Tree;
import OOP_Java.HomeWork.view.ConsoleView;

public class TreeService<E extends Human> extends Tree<E> implements Service<E>, Iterable<E> {
    private List<E> humanList;

    public TreeService(){
        this.humanList = new ArrayList<>();
    }
    public List<E> getHumansList() {
        return humanList;
    }

    @Override
    public List<E> readTree(FileWorker<E> obj) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<E> lst = new ArrayList<>();
        lst  = obj.read();
        return lst;
    }
    @Override
    public void saveTree(FileWorker<E> obj) throws IOException {
        obj.save(); 
    }

    @Override
    public void sortByName() {
        Collections.sort(this.getHumansList(), new HumanComporatorByName());
        // tree.getHumansList().sort(new HumanComporatorByName());
    }
    @Override
    public void sortByBirthDay() {
        Collections.sort(this.getHumansList(), new HumanComporatorByBirth());
        // tree.getHumansList().sort(new HumanComporatorByBirth());
    }
    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    @Override
    public void get(String function) {
        switch (function) {
            case "1":
                System.out.println("List of human: ");
                for (E human : humanList) {
                    System.out.println(human);
                };
                break;
            case "2":
                FactoryHuman person = new FactoryHuman();
                humanList.add((E) person.createHuman());
                break;
        }
    }
    
    
    
}
