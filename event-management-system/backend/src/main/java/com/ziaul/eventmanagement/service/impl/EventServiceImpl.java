package com.ziaul.eventmanagement.service.impl;

import com.ziaul.eventmanagement.service.EventService;
import com.ziaul.eventmanagement.dto.EventRequest;
import com.ziaul.eventmanagement.dto.EventResponse;
import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.mapper.EventMapper;
import com.ziaul.eventmanagement.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repo;
    public EventServiceImpl(EventRepository repo){ this.repo = repo; }

    @Override
    public EventResponse create(EventRequest req){
        Event e = EventMapper.toEntity(req);
        e = repo.save(e);
        return EventMapper.toResponse(e);
    }

    @Override
    public List<EventResponse> getAll(){
        return repo.findAll().stream().map(EventMapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public EventResponse getById(Long id){
        return repo.findById(id).map(EventMapper::toResponse).orElse(null);
    }

    @Override
    public EventResponse update(Long id, EventRequest req){
        Event existing = repo.findById(id).orElseThrow();
        existing.setTitle(req.title);
        existing.setDescription(req.description);
        existing.setStartDate(req.startDate);
        existing.setEndDate(req.endDate);
        existing.setStartTime(req.startTime);
        existing.setEndTime(req.endTime);
        existing.setLocation(req.location);
        existing.setOrganizerName(req.organizerName);
        existing.setContactEmail(req.contactEmail);
        existing.setContactPhone(req.contactPhone);
        existing = repo.save(existing);
        return EventMapper.toResponse(existing);
    }

    @Override
    public void delete(Long id){
        repo.deleteById(id);
    }
}
