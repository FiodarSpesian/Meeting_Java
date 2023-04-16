package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class AddHuman extends Command {

    public AddHuman(ConsoleView button) {
        super(button);
        description = "Add new human.";
    }
    
    @Override
    public void execute() {
        button.addHuman();
    }
}
