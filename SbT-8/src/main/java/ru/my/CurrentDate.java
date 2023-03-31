package ru.my;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate implements Command{
    @Override
    public String getName() {
        return "date";
    }

    @Override
    public String getDescription() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(now);
    }

    @Override
    public String exec() {
        return getDescription();
    }

}
