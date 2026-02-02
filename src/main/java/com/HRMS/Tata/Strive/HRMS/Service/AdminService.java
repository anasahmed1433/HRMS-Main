package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.Admin;
import com.HRMS.Tata.Strive.HRMS.Repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Integer id) {
        return adminRepository.findById(id).orElse(null);
    }
}
