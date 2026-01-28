package com.HRMS.Tata.Strive.HRMS.Repository;

import com.HRMS.Tata.Strive.HRMS.Entity.ProjectUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectUpdateRepository extends JpaRepository<ProjectUpdate, Integer> {

    List<ProjectUpdate> findByEmployeeEmployeeId(int employeeId);
}

