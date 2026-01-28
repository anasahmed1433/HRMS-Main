package com.HRMS.Tata.Strive.HRMS.Controller;

import com.HRMS.Tata.Strive.HRMS.Entity.Login;
import com.HRMS.Tata.Strive.HRMS.Service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public Login createLogin(@RequestBody Login login) {
        return loginService.saveLogin(login);
    }
}

