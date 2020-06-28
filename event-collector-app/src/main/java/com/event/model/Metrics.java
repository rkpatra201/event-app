package com.event.model;

import java.util.List;

public class Metrics {
    private Integer pastMinutes;
    private Integer eventCount;
    private List<Event> events;

    public Metrics(Integer pastMinutes, Integer eventCount, List<Event> events) {
        this.pastMinutes = pastMinutes;
        this.eventCount = eventCount;
        this.events = events;
    }

    public Integer getPastMinutes() {
        return pastMinutes;
    }

    public void setPastMinutes(Integer pastMinutes) {
        this.pastMinutes = pastMinutes;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
