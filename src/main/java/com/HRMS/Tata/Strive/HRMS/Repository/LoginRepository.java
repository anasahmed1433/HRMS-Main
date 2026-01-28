package com.HRMS.Tata.Strive.HRMS.Repository;

import com.HRMS.Tata.Strive.HRMS.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Integer> {

    Optional<Login> findByUsername(String username);
}
