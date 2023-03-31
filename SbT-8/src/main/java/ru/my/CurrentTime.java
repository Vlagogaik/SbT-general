package ru.my;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime implements Command{

    @Override
    public String getName() {
        return "time";
    }

    @Override
    public String getDescription() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(now);
    }
    @Override
    public String exec() {
        return getDescription();
    }


}
