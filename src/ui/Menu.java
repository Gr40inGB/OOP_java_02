package ui;

import ui.console.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    String name;
    View view;
    List<Command> commandList;

    public Menu(String name, View view) {
        this.view = view;
        this.commandList = new ArrayList<>();
    }

    public void add(Command command){
        this.commandList.add(command);
    }

    public String showMenu() {
        StringBuilder sb = new StringBuilder(this.name+"\n");
        for (int i = 0; i < this.commandList.size(); i++) {
            sb.append("\t").append(i + 1).append(": ").append(this.commandList.get(i)).append("/n");
        }
        sb.append("Select number of operation: ");
        return sb.toString();
    }
}
