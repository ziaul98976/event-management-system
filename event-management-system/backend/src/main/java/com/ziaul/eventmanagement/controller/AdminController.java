package com.ziaul.eventmanagement.controller;

import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminController {
    private final EventService service;
    public AdminController(EventService service){ this.service = service; }

    @GetMapping("/events")
    public List<Event> list(){ return service.findAll(); }

    @PostMapping("/events")
    public Event create(@RequestBody Event e){ return service.save(e); }
}
