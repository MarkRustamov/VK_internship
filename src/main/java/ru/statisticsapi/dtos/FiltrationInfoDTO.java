package ru.statisticsapi.dtos;

import java.sql.Date;
import java.text.ParseException;

public class FiltrationInfoDTO {
    private String eventName;

    private Date from;

    private Date to;

    public FiltrationInfoDTO(String eventName, Date from, Date to) {
        this.eventName = eventName;
        this.from = from;
        this.to = to;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) throws ParseException {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
