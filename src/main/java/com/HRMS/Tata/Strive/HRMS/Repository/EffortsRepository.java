package com.HRMS.Tata.Strive.HRMS.Repository;

import com.HRMS.Tata.Strive.HRMS.Entity.Efforts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EffortsRepository extends JpaRepository<Efforts, Integer> {

    List<Efforts> findByEmployeeEmployeeId(Integer employeeId);
}

