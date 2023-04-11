package OOP_Java.HomeWork.presenter;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.Service;
import OOP_Java.HomeWork.model.service.TreeService;
import OOP_Java.HomeWork.view.View;

public class Presenter {
    private View view;
    private TreeService treeService;
    // private TreeService<Human> service;
    
    public Presenter(View view){
        this.view = view;
        view.setPresenter(this);
    }
    // public void onClick(String function) {
    //     service.get(function); // 1:15:00 по семинару
    //     // view.print("text");
    // }

    public void addHuman(String name, String surname, String gender, String birthDay) {
        treeService.addHuman(name,  surname,  gender,  birthDay);
    }

}
