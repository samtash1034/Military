package com.sam.mapper;

import com.sam.domain.Employer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployerMapper {

    List<Employer> queryAllEmployer();
}
