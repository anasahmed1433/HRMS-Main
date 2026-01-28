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
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    private String name;
    private String email;
    private String phone;
    private String role;
    private LocalDate dateOfJoining;
    private String employmentStatus;

    @ManyToOne
    @JoinColumn(name = "org_unit_id")
    private OrgUnit orgUnit;
}
