package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class Read extends Command{

    public Read(ConsoleView button) {
        super(button);
        description = "Load family tree from file.";
    }

    @Override
    public void execute() {
        button.read();
    }
    
}
