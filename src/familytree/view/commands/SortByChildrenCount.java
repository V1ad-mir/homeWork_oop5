package familytree.view.commands;



import familytree.view.ConsoleUI;

public class SortByChildrenCount extends Command {
    public SortByChildrenCount(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по колличеству детей";
    }

    public void execute(){
        consoleUI.sortByChildrenCount();
    }
}