package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/16  21:27
 */
@Entity
@Table(name = "EventList")
public class EventList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long eventId;

    private String event;
    private String eventIntro;
    private boolean done;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventIntro() {
        return eventIntro;
    }

    public void setEventIntro(String eventIntro) {
        this.eventIntro = eventIntro;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
