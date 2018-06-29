package com.example.testboot.boottest;

import com.example.testboot.boottest.controller.RestTestController;
import com.example.testboot.boottest.service.Iservice;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractIT {

    @MockBean
    public RestTestController rest;

    @MockBean
    public Iservice service;
}
