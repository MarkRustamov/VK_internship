package ru.statisticsapi.services;

import org.springframework.stereotype.Service;
import ru.statisticsapi.dtos.EventDTO;
import ru.statisticsapi.dtos.EventStatisticsDTO;
import ru.statisticsapi.dtos.FiltrationInfoDTO;
import ru.statisticsapi.entities.Event;
import ru.statisticsapi.mappers.EventMapper;
import ru.statisticsapi.repositories.EventRepository;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    private final EventMapper mapper;


    public EventService(EventRepository eventRepository, EventMapper mapper) {
        this.eventRepository = eventRepository;
        this.mapper = mapper;
    }

    public Event save(EventDTO eventDTO) {
        Event event = mapper.toEvent(eventDTO);
        return eventRepository.save(event);
    }

    public EventStatisticsDTO countEventsByEventNameWithDateAndEventNameFiltration(FiltrationInfoDTO filtrationInfoDTO) {
        return eventRepository.countEventsByEventNameWithDateAndEventNameFiltration(filtrationInfoDTO.getFrom(),
                filtrationInfoDTO.getTo(), filtrationInfoDTO.getEventName());
    }

    public List<EventStatisticsDTO> countEventsByUserIpWithDateAndEventNameFiltration(FiltrationInfoDTO filtrationInfoDTO) {
        return eventRepository.countEventsByUserIpWithDateAndEventNameFiltration(filtrationInfoDTO.getFrom(),
                filtrationInfoDTO.getTo(), filtrationInfoDTO.getEventName());
    }

    public List<EventStatisticsDTO> countEventsByUserStatusWithDateAndEventNameFiltration(FiltrationInfoDTO filtrationInfoDTO) {
        return eventRepository.countEventsByUserStatusWithDateAndEventNameFiltration(filtrationInfoDTO.getFrom(),
                filtrationInfoDTO.getTo(), filtrationInfoDTO.getEventName());
    }
}