package familytree.view.commands;


import familytree.view.ConsoleUI;

public class GetChildren extends Command {
    public GetChildren(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список детей";
    }

    public void execute(){
        consoleUI.getChildren();
    }
}