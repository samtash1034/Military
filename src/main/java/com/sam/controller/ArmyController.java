package com.sam.controller;

import com.sam.domain.Army;
import com.sam.service.ArmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArmyController {

    @Autowired
    private ArmyService armyService;

    @RequestMapping("/armys")
    @ResponseBody
    public List<Army> queryAllArmy(){
        List<Army> armies = armyService.queryAllArmy();

//        for (Army army : armies) {
//            System.out.println(army);
//        }

        return armies;
    }
}
