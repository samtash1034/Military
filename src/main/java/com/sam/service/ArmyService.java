package com.sam.service;

import com.sam.mapper.ArmyMapper;
import com.sam.domain.Army;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmyService {

    @Autowired
    private ArmyMapper armyMapper;

    public List<Army> queryAllArmy(){
        return armyMapper.queryAllArmy();
    }
}
