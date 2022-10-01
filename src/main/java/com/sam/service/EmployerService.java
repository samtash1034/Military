package com.sam.service;

import com.sam.mapper.EmployerMapper;
import com.sam.domain.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {

    @Autowired
    private EmployerMapper employerMapper;

    public List<Employer> queryAllEmployer(){
        return employerMapper.queryAllEmployer();
    }
}
