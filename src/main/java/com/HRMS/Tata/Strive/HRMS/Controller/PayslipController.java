package com.HRMS.Tata.Strive.HRMS.Controller;

import com.HRMS.Tata.Strive.HRMS.Entity.Payslip;
import com.HRMS.Tata.Strive.HRMS.Service.PayslipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payslips")
@CrossOrigin
public class PayslipController {

    private final PayslipService payslipService;

    public PayslipController(PayslipService payslipService) {
        this.payslipService = payslipService;
    }

    @PostMapping
    public Payslip generatePayslip(@RequestBody Payslip payslip) {
        return payslipService.generatePayslip(payslip);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Payslip> getPayslips(@PathVariable Integer employeeId) {
        return payslipService.getPayslipsByEmployee(employeeId);
    }
}

