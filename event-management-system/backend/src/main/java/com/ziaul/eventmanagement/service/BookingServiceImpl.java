package com.ziaul.eventmanagement.service;

import com.ziaul.eventmanagement.booking.Booking;
import com.ziaul.eventmanagement.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository repo;
    public BookingServiceImpl(BookingRepository repo){ this.repo = repo; }
    @Override public Booking book(Long userId, Long eventId){ Booking b = new Booking(userId, eventId); return repo.save(b); }
    @Override public List<Booking> findByUser(Long userId){ return repo.findByUserId(userId); }
}
