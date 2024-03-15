package com.spring.crudpractice.employee.model.service;

import com.spring.crudpractice.configuration.CrudPracticeApplication;
import com.spring.crudpractice.employee.model.dto.EmployeeDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@ContextConfiguration(classes = { CrudPracticeApplication.class })
public class EmployeeServiceTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void 신규_사원_입력_테스트() {
            // given
            EmployeeDTO emp = new EmployeeDTO();
            emp.setEmpName("홍길동");
            emp.setPhone("01011111111");
            emp.setEmail("hong@google.com");

            // when & then
            assertDoesNotThrow(() -> employeeService.insertEmp(emp));
    }

}
