package com.sam;

import com.sam.domain.Employee;
import com.sam.service.ArmyService;
import com.sam.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class MilitaryApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    ArmyService armyService;

    @Autowired
    EmployeeService employeeService;

    @Test
    void contextLoads() throws SQLException {
        // System.out.println(dataSource.getConnection());
        // System.out.println(dataSource.getClass());
        //
        // List<Army> armies = armyService.queryAllArmy();
        // for (Army army : armies) {
        //     System.out.println(army);
        // }

        // List<Employee> employees = employeeService.queryEmployeeAndEmployer();
        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }
        // System.out.println("---------");
        //
        // System.out.println(employeeService.queryEmployeeAndArmyAndEmployerById(1));

        System.out.println(employeeService.updateEmployee(new Employee(12, "andy123", "123", "andy", "中士", "0985", "andy@gmail.com", "168.5.2.3", 2, 2)));

    }

}
