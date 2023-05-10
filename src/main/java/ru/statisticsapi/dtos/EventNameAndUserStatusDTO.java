package ru.statisticsapi.dtos;

import ru.statisticsapi.entities.UserStatus;

public class EventNameAndUserStatusDTO {
    private String eventName;

    private UserStatus userStatus;

    public EventNameAndUserStatusDTO(String eventName, UserStatus userStatus) {
        this.eventName = eventName;
        this.userStatus = userStatus;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
