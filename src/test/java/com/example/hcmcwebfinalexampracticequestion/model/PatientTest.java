package com.example.hcmcwebfinalexampracticequestion.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;

public class PatientTest {

    Patient p;
@Before
public void setUp(){
    p= new Patient();
}
    @Test
    public void age() {
    int actual = p.age();
//    int expected = 5;

    assertEquals(5, actual);
    }

    @After
    public void tearDown(){
         p=null;
    }
}