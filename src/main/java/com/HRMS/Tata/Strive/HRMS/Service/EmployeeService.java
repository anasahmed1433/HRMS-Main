package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.Employee;
import com.HRMS.Tata.Strive.HRMS.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // CREATE
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // READ - ALL
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // READ - BY ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(int id, Employee updatedEmployee) {

        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        if (existingEmployee != null) {
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            existingEmployee.setPhone(updatedEmployee.getPhone());
            existingEmployee.setRole(updatedEmployee.getRole());
            existingEmployee.setEmploymentStatus(updatedEmployee.getEmploymentStatus());
            existingEmployee.setDateOfJoining(updatedEmployee.getDateOfJoining());

            return employeeRepository.save(existingEmployee);
        }

        return null;
    }

    // DELETE
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
