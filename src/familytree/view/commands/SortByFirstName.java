package familytree.view.commands;



import familytree.view.ConsoleUI;

public class SortByFirstName extends Command {
    public SortByFirstName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по имени";
    }

    public void execute(){
        consoleUI.sortByFirstName();
    }
}