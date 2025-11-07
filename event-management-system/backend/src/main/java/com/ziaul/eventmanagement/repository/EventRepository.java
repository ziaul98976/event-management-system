package com.ziaul.eventmanagement.repository;

import com.ziaul.eventmanagement.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
