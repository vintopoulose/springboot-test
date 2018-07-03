package com.example.testboot.boottest.service;

import com.example.testboot.boottest.AbstractIT;
import org.junit.Assert;
import org.junit.Test;

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

