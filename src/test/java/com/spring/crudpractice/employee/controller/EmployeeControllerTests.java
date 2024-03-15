package com.spring.crudpractice.employee.controller;

import com.spring.crudpractice.configuration.CrudPracticeApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@ContextConfiguration(classes = { CrudPracticeApplication.class})
public class EmployeeControllerTests {

    @Autowired
    private EmployeeController employeeController;
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void 전체_사원_조회용_컨트롤러_테스트() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employee/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("employee/list"))
                .andDo(MockMvcResultHandlers.print());
    }
}
