package com.HRMS.Tata.Strive.HRMS.Repository;

import com.HRMS.Tata.Strive.HRMS.Entity.Payslip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayslipRepository extends JpaRepository<Payslip, Integer> {

    List<Payslip> findByEmployeeEmployeeId(Integer employeeId);
}

