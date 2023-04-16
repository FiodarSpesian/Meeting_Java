package OOP_Java.HomeWork.presenter;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.TreeService;
import OOP_Java.HomeWork.view.View;

public class Presenter {
    public View view;
    private TreeService<Human> treeService;
    
    public Presenter(View view){
        this.view = view;
        this.treeService = new TreeService<>();
        view.setPresenter(this);
    }

    public void addHuman(String name, String surname, String gender, String birthDay, String fName,  String mName) {
        treeService.addHuman(name,  surname,  gender,  birthDay, fName, mName);
    }

    public void getHumansList() {
        treeService.getHumansList();
    }

    public void getInfoByHuman(String name, String surname) {
        treeService.getInfoByHuman(name, surname);
    }
    public void print(String text) {
        view.print(text);
    }
    public void save() {
        treeService.save();
    }
    public void read() {
        treeService.read();
    }

}
