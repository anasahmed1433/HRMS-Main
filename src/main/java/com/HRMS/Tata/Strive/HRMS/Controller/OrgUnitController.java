package com.HRMS.Tata.Strive.HRMS.Controller;



import com.HRMS.Tata.Strive.HRMS.Entity.OrgUnit;
import com.HRMS.Tata.Strive.HRMS.Service.OrgUnitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/org-units")
@CrossOrigin
public class OrgUnitController {

    private final OrgUnitService orgUnitService;

    public OrgUnitController(OrgUnitService orgUnitService) {
        this.orgUnitService = orgUnitService;
    }

    @PostMapping
    public OrgUnit createOrgUnit(@RequestBody OrgUnit orgUnit) {
        return orgUnitService.saveOrgUnit(orgUnit);
    }

    @GetMapping
    public List<OrgUnit> getAllOrgUnits() {
        return orgUnitService.getAllOrgUnits();
    }
}

