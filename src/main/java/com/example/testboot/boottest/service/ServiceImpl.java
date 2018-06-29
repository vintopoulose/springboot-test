package com.example.testboot.boottest.service;

import com.example.testboot.boottest.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Iservice{
    @Override
    public Employee findAll() {
        return new Employee("test","10k");
    }
}
