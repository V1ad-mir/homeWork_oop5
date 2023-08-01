package familytree.view.commands;


import familytree.view.ConsoleUI;

public class AddPerson extends Command{

    public AddPerson(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить человека";
    }

    public void execute(){
         consoleUI.addPersonFamily();
    }
}