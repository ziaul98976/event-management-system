package com.ziaul.eventmanagement.event;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDate startDate;
    private LocalDate endDate;

    private LocalTime startTime;
    private LocalTime endTime;

    private String location;
    private String organizerName;
    private String contactEmail;
    private String contactPhone;

    public Event() {}

    public Event(String title, String description, LocalDate startDate, LocalDate endDate,
                 LocalTime startTime, LocalTime endTime, String location,
                 String organizerName, String contactEmail, String contactPhone) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.organizerName = organizerName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // getters and setters

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public java.time.LocalDate getStartDate(){return startDate;}
    public void setStartDate(java.time.LocalDate startDate){this.startDate = startDate;}

    public java.time.LocalDate getEndDate(){return endDate;}
    public void setEndDate(java.time.LocalDate endDate){this.endDate = endDate;}

    public java.time.LocalTime getStartTime(){return startTime;}
    public void setStartTime(java.time.LocalTime startTime){this.startTime = startTime;}

    public java.time.LocalTime getEndTime(){return endTime;}
    public void setEndTime(java.time.LocalTime endTime){this.endTime = endTime;}

    public String getLocation(){return location;}
    public void setLocation(String location){this.location = location;}

    public String getOrganizerName(){return organizerName;}
    public void setOrganizerName(String organizerName){this.organizerName = organizerName;}

    public String getContactEmail(){return contactEmail;}
    public void setContactEmail(String contactEmail){this.contactEmail = contactEmail;}

    public String getContactPhone(){return contactPhone;}
    public void setContactPhone(String contactPhone){this.contactPhone = contactPhone;}

}
