package com.example.testboot.boottest.service;

import com.example.testboot.boottest.AbstractIT;
import com.example.testboot.boottest.controller.RestTestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ServiceImpl2Test extends AbstractIT {



    @Test
    public void contextLoadsrest() {
        Assert.assertNotNull(super.rest);
    }
    @Test
    public void contextLoadsService() {
        Assert.assertNotNull(super.service);
    }
}

