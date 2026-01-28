package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.ProjectUpdate;
import com.HRMS.Tata.Strive.HRMS.Repository.ProjectUpdateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectUpdateService {

    private final ProjectUpdateRepository projectUpdateRepository;

    public ProjectUpdateService(ProjectUpdateRepository projectUpdateRepository) {
        this.projectUpdateRepository = projectUpdateRepository;
    }

    public ProjectUpdate saveUpdate(ProjectUpdate update) {
        return projectUpdateRepository.save(update);
    }

    public List<ProjectUpdate> getUpdatesByEmployee(int employeeId) {
        return projectUpdateRepository.findByEmployeeEmployeeId(employeeId);
    }
}

