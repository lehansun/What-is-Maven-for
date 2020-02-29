package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Wednesday implements WeekDay {
    private String name = "Среда";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}