package familytree.view.commands;



import familytree.view.ConsoleUI;

public class SaveFile extends Command {
    public SaveFile(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить данные в файла";
    }

    public void execute(){
        consoleUI.saveFile();
    }
}