package com.cyt.democyt.service;

import com.cyt.democyt.bean.People;

import java.util.List;

public interface TestService {
    /**
     * 添加
     * @param people
     * @return
     */
    Integer add(People people);

    Integer delete(Integer id);

    Integer update(People people);

    People select(Integer id);

    List<People> selectAll();
}
