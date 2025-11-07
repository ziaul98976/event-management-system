package com.ziaul.eventmanagement.controller;

import com.ziaul.eventmanagement.booking.Booking;
import com.ziaul.eventmanagement.service.BookingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/public/bookings")
@CrossOrigin(origins = "http://localhost:5173")
public class PublicBookingController {
    private final BookingService service;
    public PublicBookingController(BookingService service){ this.service = service; }

    @PostMapping("/book")
    public Booking book(@RequestParam Long userId, @RequestParam Long eventId){
        return service.book(userId, eventId);
    }

    @GetMapping("/by-user/{userId}")
    public List<Booking> byUser(@PathVariable Long userId){ return service.findByUser(userId); }
}
