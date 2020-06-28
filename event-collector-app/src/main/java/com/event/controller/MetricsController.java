package com.event.controller;

import com.event.model.Event;
import com.event.model.Metrics;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/metrics/")
public class MetricsController {

    @Autowired
    private EventRegistry eventRegistry;

    @GetMapping("{past}/")
    public Metrics collectEvents(@PathVariable("past") Integer past) {
        if (past < 0 && past > 30) {
            throw new RuntimeException("events available for past 30 minutes only");
        }
        List<Event> events = eventRegistry.readEvents(past);
        Metrics m = new Metrics(past, events.size(), events);
        return m;
    }
}
