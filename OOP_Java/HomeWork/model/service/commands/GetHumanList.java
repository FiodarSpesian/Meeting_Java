package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class GetHumanList extends Command{

    public GetHumanList(ConsoleView button) {
        super(button);
        description = "Get list of human.";
    }
    @Override
    public void execute() {
        button.getHumansList();
    }
}
