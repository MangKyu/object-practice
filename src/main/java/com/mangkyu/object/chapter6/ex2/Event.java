package com.mangkyu.object.chapter6.ex2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {

    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(RecurringSchedule schedule) {
        return from.getDayOfWeek() == schedule.getDayOfWeek()
            && from.toLocalTime().equals(schedule.getFrom())
            && duration.equals(schedule.getDuration());
    }

    public void reschedule(RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(schedule)), schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long daysDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
