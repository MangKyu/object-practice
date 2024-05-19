package com.mangkyu.object.chapter6.ex1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        case1();
        case2();
    }

    private static void case1() {
        Event meeting = new Event(
            "회의",
            LocalDateTime.of(2019, 5, 8, 10, 30),
            Duration.ofMinutes(30)
        );

        RecurringSchedule schedule = new RecurringSchedule(
            "회의",
            DayOfWeek.WEDNESDAY,
            LocalTime.of(10, 30),
            Duration.ofMinutes(30)
        );

        assert meeting.isSatisfied(schedule) == true;
    }

    private static void case2() {
        Event meeting = new Event(
            "회의",
            LocalDateTime.of(2019, 5, 9, 10, 30),
            Duration.ofMinutes(30)
        );

        RecurringSchedule schedule = new RecurringSchedule(
            "회의",
            DayOfWeek.WEDNESDAY,
            LocalTime.of(10, 30),
            Duration.ofMinutes(30)
        );

        assert meeting.isSatisfied(schedule) == false;
        assert meeting.isSatisfied(schedule) == true;
    }
}
