package com.ziaul.eventmanagement.booking;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long eventId;
    private LocalDateTime bookedAt = LocalDateTime.now();

    public Booking() {}
    public Booking(Long userId, Long eventId){ this.userId = userId; this.eventId = eventId; }
    // getters & setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}
    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId = userId;}
    public Long getEventId(){return eventId;}
    public void setEventId(Long eventId){this.eventId = eventId;}
    public LocalDateTime getBookedAt(){return bookedAt;}
    public void setBookedAt(LocalDateTime bookedAt){this.bookedAt = bookedAt;}
}
