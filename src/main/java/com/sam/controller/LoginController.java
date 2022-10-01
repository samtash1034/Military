package com.sam.controller;

import com.sam.domain.Employee;
import com.sam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    /**
     * 驗證帳號是否存在
     */
    @RequestMapping("/checkUsername")
    @ResponseBody
    public Boolean checkUsername(@RequestBody Employee employee){

        return employeeService.checkUsername(employee.getUsername());

    }

    /**
     * 登入功能
     * @param employee
     * @return
     */
    @RequestMapping("/employee/login")
    @ResponseBody
    public Boolean login(@RequestBody Employee employee, HttpSession session){
        String username = employee.getUsername();
        String password = employee.getPassword();

        session.setAttribute("Employee", employee);

        return employeeService.employeeLogin(username, password);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        System.out.println("開始刪除session");
        System.out.println("session" + session.getAttribute("Employee"));
        session.removeAttribute("Employee");
        return "redirect:/index";
    }



}
