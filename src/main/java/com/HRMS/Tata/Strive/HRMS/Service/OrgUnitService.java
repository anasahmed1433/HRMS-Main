package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.OrgUnit;
import com.HRMS.Tata.Strive.HRMS.Repository.OrgUnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUnitService {

    private final OrgUnitRepository orgUnitRepository;

    public OrgUnitService(OrgUnitRepository orgUnitRepository) {
        this.orgUnitRepository = orgUnitRepository;
    }

    public OrgUnit saveOrgUnit(OrgUnit orgUnit) {
        return orgUnitRepository.save(orgUnit);
    }

    public List<OrgUnit> getAllOrgUnits() {
        return orgUnitRepository.findAll();
    }

    public OrgUnit getOrgUnitById(Integer id) {
        return orgUnitRepository.findById(id).orElse(null);
    }
}

