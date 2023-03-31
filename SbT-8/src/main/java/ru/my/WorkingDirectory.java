package ru.my;

public class WorkingDirectory implements Command{
    @Override
    public String getName() {
        return "pwd";
    }

    @Override
    public String getDescription() {
        Shell sh = new Shell();
        return sh.newDir.getAbsolutePath();
    }
    @Override
    public String exec() {
        return getDescription();
    }


}
