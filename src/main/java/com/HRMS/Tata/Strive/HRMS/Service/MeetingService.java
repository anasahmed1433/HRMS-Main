package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.Meeting;
import com.HRMS.Tata.Strive.HRMS.Repository.MeetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {

    private final MeetingRepository meetingRepository;

    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public Meeting saveMeeting(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }
}

