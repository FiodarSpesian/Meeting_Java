package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class SortTreeByName extends Command {

    public SortTreeByName(ConsoleView button) {
        super(button);
        description = "Sort tree by human's name.";
    }

    @Override
    public void execute() {
        button.SortTreeByName();
    }
}