package ru.statisticsapi.mappers;

import org.springframework.stereotype.Component;
import ru.statisticsapi.dtos.EventDTO;
import ru.statisticsapi.entities.Event;

import java.util.Date;

@Component
public class EventMapper {
    public EventDTO toDTO(Event event) {
        return new EventDTO(event.getEventName(), event.getUserIp(), event.getUserStatus());
    }

    public Event toEvent(EventDTO eventDTO) {
        return new Event(eventDTO.getEventName(), eventDTO.getUserIp(), eventDTO.getUserStatus(), new Date());
    }
}
