package OOP_Java.HomeWork;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import OOP_Java.HomeWork.model.fileWorker.FileWorker;
import OOP_Java.HomeWork.model.human.Gender;
import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.Service;
import OOP_Java.HomeWork.model.service.TreeService;
import OOP_Java.HomeWork.model.tree.Tree;
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
