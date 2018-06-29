package com.example.testboot.boottest.controller;

import com.example.testboot.boottest.model.Employee;
import com.example.testboot.boottest.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class RestTestController {

    @Autowired
    private Iservice service;

    @GetMapping("/all")
    public Employee getAll() {
        return service
                .findAll();
    }


}
