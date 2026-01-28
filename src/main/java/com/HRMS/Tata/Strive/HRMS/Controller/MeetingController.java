package com.HRMS.Tata.Strive.HRMS.Controller;

import com.HRMS.Tata.Strive.HRMS.Entity.Meeting;
import com.HRMS.Tata.Strive.HRMS.Service.MeetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meetings")
@CrossOrigin
public class MeetingController {

    private final MeetingService meetingService;

    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @PostMapping
    public Meeting scheduleMeeting(@RequestBody Meeting meeting) {
        return meetingService.saveMeeting(meeting);
    }

    @GetMapping
    public List<Meeting> getMeetings() {
        return meetingService.getAllMeetings();
    }
}

