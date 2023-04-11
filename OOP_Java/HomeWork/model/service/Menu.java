package OOP_Java.HomeWork.model.service;

import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.commands.AddHuman;
import OOP_Java.HomeWork.model.service.commands.Command;
import OOP_Java.HomeWork.model.service.commands.Finish;
import OOP_Java.HomeWork.model.service.commands.GetHumanList;
import OOP_Java.HomeWork.view.ConsoleView;

public class Menu {
    private List<Command> commands;

    public Menu(ConsoleView button) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(button));
        commands.add(new GetHumanList(button));
        commands.add(new Finish(button));
    }
    public void execute(int choice) {
        commands.get(choice - 1).execute();
    }
    public String print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            sb.append(i+1);
            sb.append(" ");
            sb.append(commands.get(i).getDescription());
        }
        return sb.toString();
    }
}
