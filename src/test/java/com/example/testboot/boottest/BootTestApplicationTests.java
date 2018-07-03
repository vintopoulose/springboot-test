package com.example.testboot.boottest;

import com.example.testboot.employee.controller.RestTestController;
import org.junit.Test;
import org.mockito.InjectMocks;


public class BootTestApplicationTests  extends AbstractIT{

	@InjectMocks
	RestTestController restTestController;

	@Test
	public void contextLoads() {
	}

}
