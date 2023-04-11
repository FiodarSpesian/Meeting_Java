package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.service.TreeService;
import OOP_Java.HomeWork.view.ConsoleView;

public class AddHuman extends Command {

    public AddHuman(ConsoleView button) {
        super(button);
        description = "Create new human.";
    }
    @Override
    public void execute() {
        button.addHuman();
    }
}
