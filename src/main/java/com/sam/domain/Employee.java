package com.sam.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {


    private Integer id;
    private String username;
    private String password;
    private String name;
    private String position;
    private String phone;
    private String email;
    private String ip;
    private Integer armyId;
    private Integer employerId;

    private Army army;
    private Employer employer;

    public Employee(Integer id, String username, String password, String name, String position, String phone, String email, String ip, Integer armyId, Integer employerId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.ip = ip;
        this.armyId = armyId;
        this.employerId = employerId;
    }
}
