package com.sam.controller;

import com.sam.domain.*;
import com.sam.dto.DeleteEmployeeVO;
import com.sam.dto.EmployeeEmployerVO;
import com.sam.dto.EmployeeVO;
import com.sam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    /**
     * 查詢全部員工
     * @return
     */
    @RequestMapping("/queryAllEmployee")
    public List<Employee> queryAllEmployee(){

        return employeeService.queryEmployeeByNameOrEmployer(null);
    }

    /**
     * 儲存員工訊息
     * @param employeeVO
     * @return
     */
    @RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
    public List<Employee> addEmployee(@RequestBody EmployeeVO employeeVO){

        for (Employee employee : employeeVO.getEmployeeList()) {
            employeeService.addEmployee(employee);
        }

        List<Employee> employeeList = employeeService.queryEmployeeByNameOrEmployer(null);

        return employeeList;
    }

    /**
     * 透過id查找員工訊息
     * @param employee
     * @return
     */
    @RequestMapping(value = "/queryEmpById", method = RequestMethod.POST)
    public Employee queryEmployeeAndArmyAndEmployerById(@RequestBody Employee employee){
        Integer id = employee.getId();

        Employee employee1 = employeeService.queryEmployeeAndArmyAndEmployerById(id);

        return employee1;
    }

    /**
     * 更新員工訊息
     * @param employeeVO
     * @return
     */
    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public List<Employee> updateEmployee(@RequestBody EmployeeVO employeeVO){

        for (Employee employee : employeeVO.getEmployeeList()) {
            employeeService.updateEmployee(employee);
        }

        List<Employee> employeeList = employeeService.queryEmployeeByNameOrEmployer(null);
        return employeeList;
    }

    /**
     * 刪除員工訊息
     * @param deleteEmployeeVO
     * @return
     */
    @RequestMapping(value = "/deleteEmployeeById", method = RequestMethod.POST)
    public List<Employee> deleteEmployeeById(@RequestBody DeleteEmployeeVO deleteEmployeeVO){

        employeeService.deleteEmployeeById(deleteEmployeeVO);

        return employeeService.queryEmployeeByNameOrEmployer(null);
    }

    @RequestMapping("/queryEmployeeByNameOrEmployer")
    public List<Employee> queryEmployeeByNameOrEmployer(@RequestBody EmployeeEmployerVO name){

        return employeeService.queryEmployeeByNameOrEmployer(name);
    }


}
