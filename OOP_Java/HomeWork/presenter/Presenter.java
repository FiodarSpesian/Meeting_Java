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

    public void addHuman(String name, String surname, String gender, String birthDay, String father, String mother) {
        treeService.addHuman(name,  surname,  gender,  birthDay, father, mother);
    }

    public void getHumansList() {
        treeService.getHumansList();
    }

    public void getInfoByHuman(String name, String surname) {
        treeService.getInfoByHuman(name, surname);
    }

}
