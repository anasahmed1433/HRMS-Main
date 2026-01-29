package com.HRMS.Tata.Strive.HRMS.Repository;

import com.HRMS.Tata.Strive.HRMS.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
