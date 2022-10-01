package com.sam.mapper;

import com.sam.domain.Army;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArmyMapper {

    List<Army> queryAllArmy();
}
