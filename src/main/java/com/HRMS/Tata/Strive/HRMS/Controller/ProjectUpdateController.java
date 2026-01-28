package com.HRMS.Tata.Strive.HRMS.Controller;

import com.HRMS.Tata.Strive.HRMS.Entity.ProjectUpdate;
import com.HRMS.Tata.Strive.HRMS.Service.ProjectUpdateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project-updates")
@CrossOrigin
public class ProjectUpdateController {

    private final ProjectUpdateService projectUpdateService;

    public ProjectUpdateController(ProjectUpdateService projectUpdateService) {
        this.projectUpdateService = projectUpdateService;
    }

    @PostMapping
    public ProjectUpdate submitUpdate(@RequestBody ProjectUpdate update) {
        return projectUpdateService.saveUpdate(update);
    }

    @GetMapping("/employee/{employeeId}")
    public List<ProjectUpdate> getUpdates(@PathVariable int employeeId) {
        return projectUpdateService.getUpdatesByEmployee(employeeId);
    }
}
