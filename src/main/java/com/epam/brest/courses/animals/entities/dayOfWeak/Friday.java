package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Friday implements WeekDay {
    private String name = "Пятница";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}