package com.HRMS.Tata.Strive.HRMS.Controller;


import com.HRMS.Tata.Strive.HRMS.Entity.Leave;
import com.HRMS.Tata.Strive.HRMS.Service.LeaveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@CrossOrigin
public class LeaveController {

    private final LeaveService leaveService;

    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping
    public Leave applyLeave(@RequestBody Leave leave) {
        return leaveService.applyLeave(leave);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Leave> getLeavesByEmployee(@PathVariable int employeeId) {
        return leaveService.getLeavesByEmployee(employeeId);
    }
}

