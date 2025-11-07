package com.ziaul.eventmanagement.service;

import com.ziaul.eventmanagement.booking.Booking;
import java.util.List;

public interface BookingService {
    Booking book(Long userId, Long eventId);
    List<Booking> findByUser(Long userId);
}
