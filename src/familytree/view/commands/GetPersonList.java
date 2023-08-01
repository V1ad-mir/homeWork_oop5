package familytree.view.commands;

import familytree.view.ConsoleUI;

public class GetPersonList extends Command {
    public GetPersonList(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список людей";
    }

    public void execute(){
        consoleUI.getPersonList();
    }
}