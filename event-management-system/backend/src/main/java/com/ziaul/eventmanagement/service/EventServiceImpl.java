package com.ziaul.eventmanagement.service;

import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository repo;
    public EventServiceImpl(EventRepository repo){ this.repo = repo; }
    @Override public List<Event> findAll(){ return repo.findAll(); }
    @Override public Event save(Event e){ return repo.save(e); }
}
