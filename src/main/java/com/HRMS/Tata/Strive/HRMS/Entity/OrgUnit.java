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
public class OrgUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orgUnitId;

    private int deptId;
    private String deptName;
    private String unitType; // DEPARTMENT / PROJECT
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
}
