package com.HRMS.Tata.Strive.HRMS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginId;

    private String username;
    private String passwordHash;
    private LocalDateTime lastLogin;
    private boolean isActive;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
