package OOP_Java.HomeWork.view;

import java.util.Scanner;

import OOP_Java.HomeWork.presenter.Presenter;

public class ConsoleView implements View{

    private Presenter presenter;
    private Scanner scanner;

    public ConsoleView(){
        scanner = new Scanner(System.in);
    }

    @Override
    public void start() {

        while(true){
            String function = scan();
            presenter.onClick(function);     
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    private String scan(){
        System.out.println("\nWright number of function which you want to do:");
        System.out.println("1 Human List\n" + "2 Add human to tree\n");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println();
    }
}
