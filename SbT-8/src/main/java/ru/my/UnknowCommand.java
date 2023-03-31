package ru.my;

public class UnknowCommand implements Command {
    @Override
    public String getName() {
        return "UnknowCommand";
    }

    @Override
    public String getDescription() {
        return "Unknown command.";
    }

    @Override
    public String exec() {
        return getDescription();
    }


}