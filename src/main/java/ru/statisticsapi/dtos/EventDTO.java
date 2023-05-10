package ru.statisticsapi.dtos;

import ru.statisticsapi.entities.UserStatus;

public class EventDTO {
    private String eventName;

    private String userIp;

    private UserStatus userStatus;

    public EventDTO(String eventName, String userIp, UserStatus userStatus) {
        this.eventName = eventName;
        this.userIp = userIp;
        this.userStatus = userStatus;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
