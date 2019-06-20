package com.cyt.democyt.service.impl;

import com.cyt.democyt.bean.People;
import com.cyt.democyt.dao.TestDao;
import com.cyt.democyt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Integer add(People people) {
        return testDao.add(people);
    }

    @Override
    public Integer delete(Integer id) {
        return testDao.delete(id);
    }

    @Override
    public Integer update(People people) {
        return testDao.update(people);
    }

    @Override
    public People select(Integer id) {
        return testDao.select(id);
    }

    @Override
    public List<People> selectAll() {
        System.out.println("ertui");
        List<People> people = null;
        try {
            people = testDao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return people;
    }
}
