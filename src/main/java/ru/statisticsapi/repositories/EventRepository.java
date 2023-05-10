package ru.statisticsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.statisticsapi.entities.Event;
import ru.statisticsapi.dtos.EventStatisticsDTO;

import java.sql.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    @Query(value = "select new ru.statisticsapi.dtos.EventStatisticsDTO(e.eventName, count(e.eventName)) " +
            "from Event as e " +
            "where e.date between :from and :to and e.eventName = :eventName" +
            " group by e.eventName")
    EventStatisticsDTO countEventsByEventNameWithDateAndEventNameFiltration(@Param("from") Date from, @Param("to") Date to, @Param("eventName") String eventName);

    @Query(value = "select new ru.statisticsapi.dtos.EventStatisticsDTO(e.userIp, count(e.userIp)) " +
            "from Event as e " +
            "where e.date between :from and :to and e.eventName = :eventName" +
            " group by e.userIp")
    List<EventStatisticsDTO> countEventsByUserIpWithDateAndEventNameFiltration(@Param("from") Date from, @Param("to") Date to, @Param("eventName") String eventName);

    @Query(value = "select new ru.statisticsapi.dtos.EventStatisticsDTO(e.userStatus, count(e.userStatus)) " +
            "from Event as e " +
            "where e.date between :from and :to and e.eventName = :eventName" +
            " group by e.userStatus")
    List<EventStatisticsDTO> countEventsByUserStatusWithDateAndEventNameFiltration(@Param("from") Date from, @Param("to") Date to, @Param("eventName") String eventName);
}
