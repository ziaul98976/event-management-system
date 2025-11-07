package com.ziaul.eventmanagement.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventRequest {
    public String title;
    public String description;
    public LocalDate startDate;
    public LocalDate endDate;
    public LocalTime startTime;
    public LocalTime endTime;
    public String location;
    public String organizerName;
    public String contactEmail;
    public String contactPhone;
}
