package com.sam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEmployerVO {

    private Integer id;
    private String username;
    private String name;
    private String position;
    private String phone;
    private String email;
    private String ip;

    private String employerName;
}
