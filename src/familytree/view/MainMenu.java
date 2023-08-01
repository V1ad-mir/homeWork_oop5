package familytree.view;

import familytree.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddPerson(consoleUI));
        commandList.add(new LoadFile(consoleUI));
        commandList.add(new SaveFile(consoleUI));
        commandList.add(new GetPersonList(consoleUI));
        commandList.add(new SortByBirthDate(consoleUI));
        commandList.add(new SortByChildrenCount(consoleUI));
        commandList.add(new SortByFirstName(consoleUI));
        commandList.add(new GetChildren(consoleUI));
        commandList.add(new Finish(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice){
        Command command = commandList.get(choice-1);
        command.execute();
    }

}
