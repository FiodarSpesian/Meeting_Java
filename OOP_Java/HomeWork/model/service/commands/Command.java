package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public abstract class Command {
    String description;
    final ConsoleView button;

    public Command(ConsoleView button) {
        this.button = button;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
