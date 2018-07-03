package com.example.testboot.employee.delegate;

import com.example.testboot.employee.model.Employee;
import com.example.testboot.employee.model.User;
import com.example.testboot.employee.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delegate implements IDelegate{
    @Autowired
    private Iservice service;

    @Override
    public User findAll() {
        return service.findAll();
    }
}
