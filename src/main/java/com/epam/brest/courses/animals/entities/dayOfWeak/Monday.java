package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Monday implements WeekDay {
    private String name = "Понедельник";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}
