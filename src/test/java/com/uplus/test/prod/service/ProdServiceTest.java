package com.uplus.test.prod.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdServiceTest {

    public ProdService prodService;

    @Before
    public void setUp() throws Exception {
        prodService = new ProdService();
    }

    @Test
    public void AC() {
        boolean test = prodService.isPC("AC");
        assertEquals(test, false);
    }

    @Test
    public void SC(){
        boolean test = prodService.isPC("SC");
        assertEquals(test, false);
    }

    @Test
    public void PC() {
        boolean test = prodService.isPC("PC");
        assertEquals(test, true);
    }
}