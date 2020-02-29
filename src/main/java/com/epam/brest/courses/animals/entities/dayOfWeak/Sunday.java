package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Sunday implements WeekDay {
    private String name = "Воскресенье";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}