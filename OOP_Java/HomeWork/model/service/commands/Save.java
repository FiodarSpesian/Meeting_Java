package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class Save extends Command {

    public Save(ConsoleView button) {
        super(button);
        description = "Save family tree to file.";
    }

    @Override
    public void execute() {
        button.save();
    }
    
}
