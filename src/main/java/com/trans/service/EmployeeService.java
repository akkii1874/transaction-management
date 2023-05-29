package com.trans.service;

import com.trans.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface EmployeeService {

    @Transactional
    public Employee addEmployee(Employee employee) throws Exception;

}
