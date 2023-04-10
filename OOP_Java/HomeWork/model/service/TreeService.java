package OOP_Java.HomeWork.model.service;

import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.commands.AddHuman;
import OOP_Java.HomeWork.model.tree.Tree;
import OOP_Java.HomeWork.view.ConsoleView;

public class TreeService<E extends Human> extends Tree<E> implements Service {
    private List<E> humanList;

    public TreeService(){
        this.humanList = new ArrayList<>();
    }
    public List<E> getHumansList() {
        return humanList;
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
                AddHuman person = new AddHuman();
                humanList.add((E) person.createHuman());
                break;
        }
    }
}
