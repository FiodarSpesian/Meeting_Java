package OOP_Java.HomeWork.presenter;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.TreeService;
import OOP_Java.HomeWork.view.View;

public class Presenter {
    private View view;
    private TreeService<Human> service;
    
    public Presenter(View view, TreeService<Human> service){
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }
    public void onClick(String function) {
        service.get(function); // 1:15:00 по семинару
        view.print("text");
    }
}
