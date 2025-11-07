package com.ziaul.eventmanagement.mapper;

import com.ziaul.eventmanagement.event.Event;
import com.ziaul.eventmanagement.dto.EventRequest;
import com.ziaul.eventmanagement.dto.EventResponse;

public class EventMapper {

    public static Event toEntity(EventRequest req){
        if(req == null) return null;
        Event e = new Event();
        e.setTitle(req.title);
        e.setDescription(req.description);
        e.setStartDate(req.startDate);
        e.setEndDate(req.endDate);
        e.setStartTime(req.startTime);
        e.setEndTime(req.endTime);
        e.setLocation(req.location);
        e.setOrganizerName(req.organizerName);
        e.setContactEmail(req.contactEmail);
        e.setContactPhone(req.contactPhone);
        return e;
    }

    public static EventResponse toResponse(Event e){
        if(e == null) return null;
        EventResponse r = new EventResponse();
        r.id = e.getId();
        r.title = e.getTitle();
        r.description = e.getDescription();
        r.startDate = e.getStartDate();
        r.endDate = e.getEndDate();
        r.startTime = e.getStartTime();
        r.endTime = e.getEndTime();
        r.location = e.getLocation();
        r.organizerName = e.getOrganizerName();
        r.contactEmail = e.getContactEmail();
        r.contactPhone = e.getContactPhone();
        return r;
    }
}
