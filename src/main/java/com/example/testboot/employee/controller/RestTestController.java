package com.example.testboot.employee.controller;

import com.example.testboot.employee.delegate.IDelegate;
import com.example.testboot.employee.model.Employee;
import com.example.testboot.employee.model.User;
import com.example.testboot.employee.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class RestTestController {

    @Autowired
    private IDelegate delegate;

    @GetMapping("/all")
    public User getAll() {
        return delegate
                .findAll();
    }


}
