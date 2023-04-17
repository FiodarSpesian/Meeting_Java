package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class SortTreeByBirthDay extends Command {

    public SortTreeByBirthDay(ConsoleView button) {
        super(button);
        description = "Sort tree by human's birthday.";
    }

    @Override
    public void execute() {
        button.SortTreeByBirthDay();
    }
    
}
