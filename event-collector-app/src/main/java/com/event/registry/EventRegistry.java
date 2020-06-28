package com.event.registry;

import com.event.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Component
public class EventRegistry {

    private final List<Event> events = new ArrayList<>();

    public void addAll(Event[] eventArray) {
        List<Event> emittedEvents = Arrays.stream(eventArray).collect(Collectors.toList());
        events.addAll(emittedEvents);
    }

    public List<Event> readEvents(Integer pastMinutes) {
        Long currentTimeMs = System.currentTimeMillis();
        Long pastTimeMs = currentTimeMs - pastMinutes * 60 *1000;
        List<Event> copiedEvents = new CopyOnWriteArrayList<>(events);
        return copiedEvents.stream().
                filter(e -> {
                    return e.getTime() >= pastTimeMs && e.getTime() <= currentTimeMs;
                }).collect(Collectors.toList());
    }
}
