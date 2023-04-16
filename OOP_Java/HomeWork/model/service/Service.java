package OOP_Java.HomeWork.model.service;

import OOP_Java.HomeWork.model.human.Human;

public interface Service<T extends Human> {
    public void addHuman(String name, String surname, String gender, String birthDay, String father, String mother);
    public void getHumansList();
    public void sortByName();
    public void sortByBirthDay();
    public void getInfoByHuman(String name, String surname);
}
