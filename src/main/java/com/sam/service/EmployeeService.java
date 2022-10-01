package com.sam.service;

import com.sam.dto.DeleteEmployeeVO;
import com.sam.dto.EmployeeEmployerVO;
import com.sam.mapper.EmployeeMapper;
import com.sam.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    /**
     * 新增員工訊息
     * @param employee
     */
    public int addEmployee(Employee employee){
        return employeeMapper.addEmployee(employee);
    }

    /**
     * 透過id查詢員工
     * @param id
     * @return
     */
    public Employee queryEmployeeAndArmyAndEmployerById(Integer id){
        return  employeeMapper.queryEmployeeAndArmyAndEmployerById(id);
    }

    /**
     * 更新員工資料
     * @param employee
     */
    public int updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 透過id刪除員工訊息
     * @param id
     */
    public int deleteEmployeeById(DeleteEmployeeVO deleteEmployeeVO){
        List<Integer> list = new ArrayList<>();
        String[] id = deleteEmployeeVO.getId();
        for(int i = 0; i < id.length; i++){
            list.add(Integer.valueOf(id[i]));
        }
        return employeeMapper.deleteEmployeeById(list);
    }


    public Boolean employeeLogin(String username, String password){
        Employee employee = employeeMapper.employeeLogin(username, password);

        if(employee == null){
            return false;
        }else{
            return true;
        }

    }

    public boolean checkUsername(String username){

        int i = employeeMapper.checkUsername(username);
        System.out.println("帳號是否存在：" + i);
        if(i == 1){
            return true;
        }
        return false;
    }

    public List<Employee> queryEmployeeByNameOrEmployer(EmployeeEmployerVO queryName){
        return employeeMapper.queryEmployeeByNameOrEmployer(queryName);
    }
}
