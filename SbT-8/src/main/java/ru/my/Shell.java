package ru.my;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Shell implements AddCommand{
    public File newDir = new File(System.getProperty("user.dir"));

    private Map<String, Command> commands = new HashMap<>();

    public Shell() {
        this.commands = new HashMap<>();
    }
    public Shell(List<Command> commands) {
        for (Command cmd : commands) {
            this.commands.put(cmd.getName(), cmd);
        }
    }
    @Override
    public String executeCommand(String command) {
        Command cmd = commands.get(command);
        if (cmd == null) {
            return new UnknowCommand().exec();
        }
        return cmd.exec();
    }

    @Override
    public void addCommand(Command command) {
        commands.put(command.getName(), command);
    }

}
