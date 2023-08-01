package familytree.view.commands;



import familytree.view.ConsoleUI;

public class LoadFile extends Command {
    public LoadFile(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить данные из файла";
    }

    public void execute(){
        consoleUI.loadFile();
    }
}