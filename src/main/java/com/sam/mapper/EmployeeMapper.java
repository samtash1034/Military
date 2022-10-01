package com.sam.mapper;

import com.sam.domain.*;
import com.sam.dto.EmployeeEmployerVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {


    int addEmployee(Employee employee);

    Employee queryEmployeeAndArmyAndEmployerById(Integer id);

    int updateEmployee(Employee employee);

    int deleteEmployeeById(List<Integer> id);

    Employee employeeLogin(String username, String password);

    int checkUsername(String username);

    List<Employee> queryEmployeeByNameOrEmployer(EmployeeEmployerVO queryName);
}
