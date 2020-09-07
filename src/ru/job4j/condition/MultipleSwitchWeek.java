package ru.job4j.condition;

public class MultipleSwitchWeek {
    public void numberOfDay(String name) {
        int value = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббоота", "Saturday" -> 6;
            case "Весресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}