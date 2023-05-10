package ru.statisticsapi.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import ru.statisticsapi.dtos.EventDTO;
import ru.statisticsapi.dtos.EventNameAndUserStatusDTO;
import ru.statisticsapi.dtos.EventStatisticsDTO;
import ru.statisticsapi.dtos.FiltrationInfoDTO;
import ru.statisticsapi.entities.Event;
import ru.statisticsapi.services.EventService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/save")
    public Event save(EventNameAndUserStatusDTO eventNameAndUserStatusDTO, HttpServletRequest request) {
        return eventService.save(new EventDTO(eventNameAndUserStatusDTO.getEventName(), request.getRemoteAddr(),
                eventNameAndUserStatusDTO.getUserStatus()));
    }

    @GetMapping("/eventNameStatistics")
    public EventStatisticsDTO getEventNameStatistics(FiltrationInfoDTO filtrationInfoDTO) {
        return eventService.countEventsByEventNameWithDateAndEventNameFiltration(filtrationInfoDTO);
    }

    @GetMapping("/userIpStatistics")
    public List<EventStatisticsDTO> getUserIpStatistics(FiltrationInfoDTO filtrationInfoDTO) {
        return eventService.countEventsByUserIpWithDateAndEventNameFiltration(filtrationInfoDTO);
    }

    @GetMapping("/userStatusStatistics")
    public List<EventStatisticsDTO> getUserStatusStatistics(FiltrationInfoDTO filtrationInfoDTO) {
        return eventService.countEventsByUserStatusWithDateAndEventNameFiltration(filtrationInfoDTO);
    }
}
