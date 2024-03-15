package com.spring.crudpractice.employee.model.dao;

import com.spring.crudpractice.employee.model.dto.EmployeeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<EmployeeDTO> findAllEmp();

    void insertEmp(EmployeeDTO emp);
}
