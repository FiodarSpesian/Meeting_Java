package OOP_Java.HomeWork.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import OOP_Java.HomeWork.model.comporators.HumanComporatorByBirth;
import OOP_Java.HomeWork.model.comporators.HumanComporatorByName;
import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.tree.Tree;

public interface Service<T extends Human> {
    public void get(String function);
    public List<T> readTree(FileWorker<T> obj) throws FileNotFoundException, IOException, ClassNotFoundException;
    public void saveTree(FileWorker<T> obj) throws IOException;
    public void sortByName();
    public void sortByBirthDay();
}
