package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class Finish extends Command {

    public Finish(ConsoleView button) {
        super(button);
        description = "End program";
    }

    @Override
    public void execute() {
        button.finish();
    }
    
}
