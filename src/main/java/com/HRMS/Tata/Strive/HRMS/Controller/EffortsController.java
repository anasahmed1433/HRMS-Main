package com.HRMS.Tata.Strive.HRMS.Controller;

import com.HRMS.Tata.Strive.HRMS.Entity.Efforts;
import com.HRMS.Tata.Strive.HRMS.Service.EffortsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/efforts")
@CrossOrigin
public class EffortsController {

    private final EffortsService effortsService;

    public EffortsController(EffortsService effortsService) {
        this.effortsService = effortsService;
    }

    @PostMapping("/insert")
    public Efforts logEffort(@RequestBody Efforts efforts) {
        return effortsService.saveEffort(efforts);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Efforts> getEfforts(@PathVariable int employeeId) {
        return effortsService.getEffortsByEmployee(employeeId);
    }
}

