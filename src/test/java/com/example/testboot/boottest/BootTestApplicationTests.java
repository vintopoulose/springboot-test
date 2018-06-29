package com.example.testboot.boottest;

import com.example.testboot.boottest.controller.RestTestController;
import com.example.testboot.boottest.service.Iservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;


public class BootTestApplicationTests  extends AbstractIT{

	@InjectMocks
	RestTestController restTestController;

	@Test
	public void contextLoads() {
	}

}
