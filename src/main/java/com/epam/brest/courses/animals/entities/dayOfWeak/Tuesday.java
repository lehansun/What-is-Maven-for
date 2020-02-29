package com.epam.brest.courses.animals.entities.dayOfWeak;

public class Tuesday implements WeekDay {
    private String name = "Вторник";

    public String getName() {
        return name;
    }

    @Override
    public String getWeekDayName() {
        return getName();
    }
}
