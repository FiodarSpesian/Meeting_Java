package OOP_Java.HomeWork.model.service.commands;

import OOP_Java.HomeWork.view.ConsoleView;

public class GetInfo extends Command {

    public GetInfo(ConsoleView button) {
        super(button);
        description = "Get info by the human.";
    }

    @Override
    public void execute() {
        button.getInfoByHuman();
    }
    
}
