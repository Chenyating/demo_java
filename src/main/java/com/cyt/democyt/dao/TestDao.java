package com.cyt.democyt.dao;

import com.cyt.democyt.bean.People;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
    Integer add(People people);

    Integer delete(Integer id);

    Integer update(People people);

    People select(Integer id);

    List<People> selectAll();
}
