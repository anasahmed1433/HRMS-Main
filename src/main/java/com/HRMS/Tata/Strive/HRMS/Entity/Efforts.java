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
public class Efforts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer effortId;

    private LocalDate workDate;
    private int hoursWorked;
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "org_unit_id")
    private OrgUnit orgUnit;
}

