package OOP_Java.HomeWork.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Human;

public interface Service<T extends Human> {
    public void get(String function);
    public void addHuman(String name, String surname, String gender, String birthDay);
    public void getHumansList();
    public List<T> readTree(FileWorker<T> obj) throws FileNotFoundException, IOException, ClassNotFoundException;
    public void saveTree(FileWorker<T> obj) throws IOException;
    public void sortByName();
    public void sortByBirthDay();
}
