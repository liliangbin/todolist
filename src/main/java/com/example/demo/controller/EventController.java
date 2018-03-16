package com.example.demo.controller;

import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liliangbin dumpling1520@gmail.com
 * @date 2018/3/16  21:30
 */
@RestController
@RequestMapping("/todolist")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("")
    public Object allEvent() {
        return eventService.findAll();
    }

    @GetMapping("/done")
    public Object hadDone() {
        return eventService.findIsDone();
    }

    @GetMapping("/notdone")
    public Object notDone() {
        return eventService.findNotDone();
    }

    @PostMapping("/add")

    public Object addEvent(String event, String eventIntro) {

        return eventService.add(event, eventIntro);
    }

    @PostMapping("/delete")
    public Object delete(long eventId) {
        return eventService.deleteOne(eventId);
    }

    @GetMapping("/deleteAll")
    public Object deleteAll() {

        return eventService.findAll();
    }

    @PostMapping("/oneDone")
    public Object oneDone(long eventId) {
        return eventService.hadDone(eventId);
    }
}
