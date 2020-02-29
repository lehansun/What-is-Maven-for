package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Thursday implements WeekDay {
    private String name = "Четверг";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}