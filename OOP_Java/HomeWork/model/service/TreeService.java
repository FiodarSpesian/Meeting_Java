package OOP_Java.HomeWork.model.service;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.AddFather;
import OOP_Java.HomeWork.model.human.AddMother;
import OOP_Java.HomeWork.model.human.Gender;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.human.HumanIterator;
import OOP_Java.HomeWork.model.tree.Tree;
import OOP_Java.HomeWork.presenter.Presenter;

public class TreeService<E extends Human> implements Service<E>, Iterable<Human>, Serializable {
    private Presenter presenter;
    private Tree<E> humanList;
    private FileWorker<E> fileWorker;

    public TreeService(Presenter presenter){
        this.humanList = new Tree<>();
        this.fileWorker = new FileWorker<>(humanList, "OOP_Java/HomeWork/tree.out");
        this.presenter = presenter;
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
            presenter.print("Wrong gender!");
        }
        human.setDayOfBirth(birthDay);
        human.setFather(new AddFather<E>(humanList, human, fName).setFather());
        human.setMother(new AddMother<E>(humanList, human, mName).setMother());
        
        humanList.add(human);
    }

    @Override
    public void getHumansList() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of human:\n");
        for (Human human : humanList) {
            sb.append(human + "\n");
        };        
        presenter.print(sb.toString());
    }

    @Override
    public void getInfoByHuman(String name, String surname) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < humanList.size(); i++) {
            if(humanList.get(i).getName().equals(name) & humanList.get(i).getSurname().equals(surname)){
                sb.append(humanList.get(i).getInfo()).append("\n");
            }
        }
        presenter.print(sb.toString());;
    }
  
    public void save() {
        try {
            fileWorker.save();
            presenter.print("Save successful.");
        } catch (Exception e) {
            presenter.print("Error with saving.");
        }
    }
    public void read() {
        List<E> lst = new ArrayList<>();
        try {
            try {
                fileWorker.read();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            presenter.print("Load successful.");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lst.size(); i++) {
                sb.append(lst.get(i)).append("\n");
            }
            presenter.print(sb.toString());
        } catch (IOException e) {
            presenter.print("Error with loading.");
        }
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
    public Iterator<Human> iterator() {
        return new HumanIterator<>(humanList);
    }   
}
