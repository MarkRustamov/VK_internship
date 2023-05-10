package ru.statisticsapi.entities;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "user_ip")
    private String userIp;

    @Column(name = "user_status")
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    private Date date;

    public Event(@NotNull String eventName, @NotNull String userIp, @NotNull UserStatus userStatus, @NotNull Date date) {
        this.eventName = eventName;
        this.userIp = userIp;
        this.userStatus = userStatus;
        this.date = date;
    }

    public Event() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(@NotNull String eventName) {
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

    public void setUserStatus(@NotNull UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(@NotNull Date date) {
        this.date = date;
    }
}
