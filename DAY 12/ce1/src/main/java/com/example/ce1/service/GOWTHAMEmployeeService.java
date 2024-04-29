package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GOWTHAMEmployee;
import com.example.ce1.repository.GOWTHAMEmployeeRepo;

@Service
public class GOWTHAMEmployeeService {
    @Autowired
    GOWTHAMEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public GOWTHAMEmployee setEmployee(GOWTHAMEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GOWTHAMEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GOWTHAMEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
