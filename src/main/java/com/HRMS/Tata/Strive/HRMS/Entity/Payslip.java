package com.HRMS.Tata.Strive.HRMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payslip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payslipId;

    private String month;
    private double basicSalary;
    private double deductions;
    private double netSalary;
    private LocalDate generatedDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

