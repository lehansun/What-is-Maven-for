package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Saturday implements WeekDay {
    private String name = "Суббота";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}

