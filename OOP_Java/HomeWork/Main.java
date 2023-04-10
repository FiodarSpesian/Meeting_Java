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
        TreeService<Human> service = new TreeService<>();
        new Presenter(view, service);


        view.start();

        // Tree<Human> familyTree = new Tree();
        // Service service = new Service(familyTree);
        // Human father1 = new Human( "Fiodar", "Spetsian", Gender.Male, "19.06.1998");
        // Human mother1 = new Human( "Diana", "Spetsian", Gender.Female, "27.09.1999");
        // Human child1 = new Human("Eva","Spetsian", Gender.Female, "03.08.2023", father1, mother1);
        // Human child2 = new Human("Gleb", "Spetsian", Gender.Male, "20.05.2023", father1, mother1);
        // Human child3 = new Human("Don", "null", null, null, null, null);


        // father1.addChild(child3);
        // child3.setFather(father1);
        // child3.setMother(mother1);
        
        // familyTree.addHuman(child2);
        // familyTree.addHuman(child3);
        // familyTree.addHuman(child1);
        // familyTree.addHuman(father1);

    //     Iterator<student.Student> iterator = group.iterator();
    //     while (iterator.hasNext()){
    //        student.Student student = iterator.next();
    //        System.out.println(student);
    // }

        // for (Human human : familyTree) {
        //     System.out.println(human);
        // }
        // familyTree.sortByName();
        // System.out.println("-------------");
        // for (Human human : familyTree) {
        //     System.out.println(human);
        // }
        // System.out.println("-------------");
        // // System.out.println(child2.getBirthDay());
        // familyTree.sortByBirthDay();
        // for (Human human : familyTree) {
        //     System.out.println(human);
        // }
    }
    
}
