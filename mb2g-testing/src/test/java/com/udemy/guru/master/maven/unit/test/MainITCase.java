package com.udemy.guru.master.maven.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MainITCase {


    @Test
    public void testFauxIntegration() {

        var msg = "Douglas ITCase";
        var guru = new GuruPragmatic();
        var result = guru.sayHello(msg);

        assertEquals(result, "Hi ".concat(msg));
    }
    
}
