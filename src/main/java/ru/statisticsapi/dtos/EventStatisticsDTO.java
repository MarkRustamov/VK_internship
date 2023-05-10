package ru.statisticsapi.dtos;

import ru.statisticsapi.entities.UserStatus;

public class EventStatisticsDTO {
    private String value;

    private long total;

    public EventStatisticsDTO(String value, long total) {
        this.value = value;
        this.total = total;
    }

    public EventStatisticsDTO(UserStatus userStatus, long total) {
        this.value = userStatus.toString();
        this.total = total;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValue(UserStatus userStatus) {
        this.value = userStatus.toString();
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
