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
import OOP_Java.HomeWork.model.human.Gender;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.human.HumanIterator;
import OOP_Java.HomeWork.model.tree.Tree;
import OOP_Java.HomeWork.presenter.Presenter;

public class TreeService<E extends Human> extends Tree<E> implements Service<E>, Iterable<E> {
    private Presenter presenter;
    private List<E> humanList;
    public TreeService(){
        this.humanList = new ArrayList<>();
    }
    @Override
    public void addHuman(String name, String surname, String gender, String birthDay, String fName, String mName) {
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
        human.setDayOfBirth(birthDay);

        for (int i = 0; i < humanList.size(); i++) {
            if(human.getFather() == null){
                if(humanList.get(i).getName().toLowerCase().equals(fName.toLowerCase())){ 
                    human.setFather(humanList.get(i));
                    if (human.getFather().getName().equals(fName)) human.getFather().addChild(human);
                } else{
                    human.setFather(null);
                }
            }
            if(human.getMother() == null){
                if(humanList.get(i).getName().toLowerCase().equals(mName.toLowerCase())){ 
                    human.setMother(humanList.get(i));
                    if (human.getMother().getName().equals(mName)) human.getMother().addChild(human);
                } else{
                    human.setMother(null);
                }
            }
        }
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
    public void getInfoByHuman(String name, String surname) {
        for (int i = 0; i < humanList.size(); i++) {
            if(humanList.get(i).getName().equals(name) & humanList.get(i).getSurname().equals(surname)){ 
                System.out.println(humanList.get(i).getInfo());
            }
        }
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

    
}
