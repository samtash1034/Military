package com.sam.dto;

import com.sam.domain.Employee;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeVO {

    private List<Employee> employeeList;

}
