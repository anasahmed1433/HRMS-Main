package com.HRMS.Tata.Strive.HRMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingId;

    private String meetingTitle;
    private LocalDate meetingDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String meetingLink;
}
