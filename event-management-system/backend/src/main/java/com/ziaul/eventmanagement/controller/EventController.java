package com.ziaul.eventmanagement.controller;

import com.ziaul.eventmanagement.dto.EventRequest;
import com.ziaul.eventmanagement.dto.EventResponse;
import com.ziaul.eventmanagement.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:5173")
public class EventController {

    private final EventService service;
    public EventController(EventService service){ this.service = service; }

    @PostMapping
    public ResponseEntity<EventResponse> create(@RequestBody EventRequest req){
        return ResponseEntity.ok(service.create(req));
    }

    @GetMapping
    public ResponseEntity<List<EventResponse>> list(){ return ResponseEntity.ok(service.getAll()); }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponse> get(@PathVariable Long id){
        EventResponse r = service.getById(id);
        if(r == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(r);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventResponse> update(@PathVariable Long id, @RequestBody EventRequest req){
        return ResponseEntity.ok(service.update(id, req));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
