package com.spring.crudpractice.employee.model.dto;

public class EmployeeDTO {

    private int empId;
    private String empName;
    private String phone;
    private String email;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String empName, String phone, String email) {
        this.empId = empId;
        this.empName = empName;
        this.phone = phone;
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
