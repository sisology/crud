package com.spring.crudpractice.employee.model.service;

import com.spring.crudpractice.employee.model.dao.EmployeeMapper;
import com.spring.crudpractice.employee.model.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public List<EmployeeDTO> findAllEmp() {
        return employeeMapper.findAllEmp();
    }

    public void insertEmp(EmployeeDTO emp) {
        employeeMapper.insertEmp(emp);
    }
}
