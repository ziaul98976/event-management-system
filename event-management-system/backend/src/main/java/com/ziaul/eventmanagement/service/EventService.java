package com.ziaul.eventmanagement.service;

import com.ziaul.eventmanagement.dto.EventRequest;
import com.ziaul.eventmanagement.dto.EventResponse;
import java.util.List;

public interface EventService {
    EventResponse create(EventRequest req);
    List<EventResponse> getAll();
    EventResponse getById(Long id);
    EventResponse update(Long id, EventRequest req);
    void delete(Long id);
}
