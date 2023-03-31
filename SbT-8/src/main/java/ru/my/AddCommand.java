package ru.my;

public interface AddCommand {
    void addCommand(Command command);
    String executeCommand(String command);
}
