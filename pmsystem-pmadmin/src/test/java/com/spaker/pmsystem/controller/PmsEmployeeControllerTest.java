package com.spaker.pmsystem.controller;

import com.spaker.pmsystem.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Create By Sunshine
 * 4/6/2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PmsEmployeeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private PmsEmployeeController pmsEmployeeController;

    @Test
    public void getlist()throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/employee/listAll"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("李四"));
        System.out.println(JsonUtil.ObjectToJson(pmsEmployeeController.getlist()));
    }

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }
}