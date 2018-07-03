//package com.example.testboot.boottest.controller;
//
//import Employee;
//import Iservice;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.bind.annotation.RestController;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = RestController.class)
//public class RestTestControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private Iservice iservice;
//
//    @Before
//    public void setup(){
//        Mockito.when(iservice.findAll()).thenReturn(new Employee("123","456"));
//    }
//
//    @Test
//    public void testMethod() throws Exception{
//        mockMvc.perform(get("http://localhost:8080//rest/employee/all")
//                .contentType(MediaType.APPLICATION_JSON)).andDo(print())
//                .andExpect(status().isOk());
//    }
//    @Test
//    public void testMethod2() throws Exception{
//        mockMvc.perform(get("http://localhost:8080//rest/employee/all")
//                .contentType(MediaType.APPLICATION_JSON)).andDo(print())
//                .andExpect(status().isOk());
//    }
//    @Test
//    public void testMethod3() throws Exception{
//        mockMvc.perform(get("http://localhost:8080//rest/employee/all")
//                .contentType(MediaType.APPLICATION_JSON)).andDo(print())
//                .andExpect(status().isOk());
//    }
//}
