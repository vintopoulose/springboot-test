package com.example.testboot.boottest.service;

import com.example.testboot.boottest.AbstractIT;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Optional;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ServiceImplTest extends AbstractIT {


    @Test
    public void contextLoads() {
        Assert.assertNotNull(super.service);
    }


    @Test
    public void optionalCheck(){
        String optionalValue= "value";
        Optional<String>  opt = Optional.of(optionalValue);
        Assert.assertTrue(opt.isPresent());

        String nullValue= null;
        Optional<String>  optnull = Optional.ofNullable(nullValue);
        Assert.assertFalse(optnull.isPresent());

        Arrays.asList(1,2,3,4,5,6).parallelStream().sorted().findFirst();



    }
}
