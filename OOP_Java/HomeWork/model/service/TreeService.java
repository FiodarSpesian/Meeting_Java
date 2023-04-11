package OOP_Java.HomeWork.model.service;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Gender;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.human.HumanIterator;
import OOP_Java.HomeWork.model.service.commands.FactoryHuman;
import OOP_Java.HomeWork.model.tree.Tree;
import OOP_Java.HomeWork.presenter.Presenter;
import OOP_Java.HomeWork.view.ConsoleView;

public class TreeService<E extends Human> extends Tree<E> implements Service<E>, Iterable<E> {
    private Presenter presenter;

    @Override
    public void addHuman(String name, String surname, String gender, String birthDay) {
        Human human = new Human();
        human.setName(name);
        human.setSurname(surname);
        if(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")){
            if(gender.toLowerCase().equals("male")){
                human.setGender(Gender.Male);
            } else{
                human.setGender(Gender.Female);
            }
        } else {
            System.out.println("Wrong gender!");
        }
        System.out.println("Enter birthday format dd.mm.yyyy:");
        human.setDayOfBirth(birthDay);
        humanList.add((E) human);
    }

    @Override
    public void getHumansList() {
        System.out.println("List of human: ");
                for (E human : humanList) {
                    System.out.println(human);
                };
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
        Collections.sort(humanList, new HumanComporatorByName());
        // tree.getHumansList().sort(new HumanComporatorByName());
    }
    @Override
    public void sortByBirthDay() {
        Collections.sort(humanList, new HumanComporatorByBirth());
        // tree.getHumansList().sort(new HumanComporatorByBirth());
    }
    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }

    @Override
    public void get(String function) {  
    }
  
}
