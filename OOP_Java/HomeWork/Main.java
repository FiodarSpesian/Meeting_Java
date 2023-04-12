package OOP_Java.HomeWork;

import java.io.FileNotFoundException;
import java.io.IOException;

import OOP_Java.HomeWork.presenter.Presenter;
import OOP_Java.HomeWork.view.ConsoleView;
import OOP_Java.HomeWork.view.View;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view);
        view.setPresenter(presenter);

        view.start();

    //     Iterator<student.Student> iterator = group.iterator();
    //     while (iterator.hasNext()){
    //        student.Student student = iterator.next();
    //        System.out.println(student);
    // }
    }
    
}
