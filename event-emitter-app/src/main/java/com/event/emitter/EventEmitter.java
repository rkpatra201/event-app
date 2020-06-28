package com.event.emitter;

import com.event.model.Event;
import com.event.registry.EventRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EventEmitter {

    @Autowired
    private EventRegistry eventRegistry;

    @Scheduled(fixedRate = 5000)
    public void publishEvent()
    {
        eventRegistry.add(new Event());
    }
}
