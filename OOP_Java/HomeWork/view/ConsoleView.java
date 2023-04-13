package OOP_Java.HomeWork.view;

import java.util.Scanner;

import OOP_Java.HomeWork.model.service.Menu;
import OOP_Java.HomeWork.presenter.Presenter;

public class ConsoleView implements View{
    private Presenter presenter;
    private Scanner sc;
    private boolean work;
    private Menu menu;

    public ConsoleView(){
        sc = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        while(work){
            System.out.println("Enter number of command:");
            menu.print();
            int choice = Integer.parseInt(scan());
            menu.execute(choice);
            System.out.println("\n");
        }
    }
    private boolean check(String text){
        return text.matches("[0-9]+");
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    public Presenter getPresenter() {
        return presenter;
    }

    private String scan(){
        // System.out.println("\nWrite number of function which you want to do:");
        // System.out.println("1 Human List\n" + "2 Add human to tree\n");
        return sc.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void getHumansList(){
        presenter.getHumansList();
    }
    public void getInfoByHuman(){
        System.out.println("Enter name of human: ");
        String name = sc.nextLine();
        System.out.println("Enter surname of human: ");
        String surname = sc.nextLine();
        presenter.getInfoByHuman(name, surname);
    }
    public void addHuman() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter surname:");
        String surname = sc.nextLine();
        System.out.println("Enter gender Male/Female:");
        String gender = sc.nextLine();
        System.out.println("Enter birthday format dd.mm.yyyy:");
        String birthDay = sc.nextLine();
        System.out.println("Father: enter name");
        String father = sc.nextLine(); 
        System.out.println("Mother: enter name");
        String mother = sc.nextLine(); 
        presenter.addHuman(name, surname, gender, birthDay, father, mother);
    }

    public void finish(){
        work = false;
    }
    
}
