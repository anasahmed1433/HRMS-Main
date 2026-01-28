package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.Payslip;
import com.HRMS.Tata.Strive.HRMS.Repository.PayslipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayslipService {

    private final PayslipRepository payslipRepository;

    public PayslipService(PayslipRepository payslipRepository) {
        this.payslipRepository = payslipRepository;
    }

    public Payslip generatePayslip(Payslip payslip) {
        payslip.setNetSalary(
                payslip.getBasicSalary() - payslip.getDeductions()
        );
        return payslipRepository.save(payslip);
    }

    public List<Payslip> getPayslipsByEmployee(int employeeId) {
        return payslipRepository.findByEmployeeEmployeeId(employeeId);
    }
}
