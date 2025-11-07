package com.ziaul.eventmanagement.controller;

import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/public/events")
@CrossOrigin(origins = "http://localhost:5173")
public class PublicEventController {
    private final EventService service;
    public PublicEventController(EventService service){ this.service = service; }

    @GetMapping
    public List<Event> list(){ return service.findAll(); }

    @PostMapping
    public Event create(@RequestBody Event e){ return service.save(e); }
}
