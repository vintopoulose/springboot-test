package com.example.testboot.employee.service;

import com.example.testboot.employee.model.Employee;
import com.example.testboot.employee.model.User;
import com.example.testboot.employee.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Iservice{

    @Autowired
    private TestRepository testRepository;

    @Override
    public User findAll() {
//        return new Employee("test","10k");
    return testRepository.findUserById(1);
    }
}
