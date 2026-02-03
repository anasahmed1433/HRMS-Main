package com.HRMS.Tata.Strive.HRMS.Service;

import com.HRMS.Tata.Strive.HRMS.Entity.Efforts;
import com.HRMS.Tata.Strive.HRMS.Repository.EffortsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EffortsService {

    private final EffortsRepository effortsRepository;

    public EffortsService(EffortsRepository effortsRepository) {
        this.effortsRepository = effortsRepository;
    }

    public Efforts saveEffort(Efforts efforts) {
        return effortsRepository.save(efforts);
    }

    public List<Efforts> getEffortsByEmployee(Integer employeeId) {
        return effortsRepository.findByEmployeeEmployeeId(employeeId);
    }
}

