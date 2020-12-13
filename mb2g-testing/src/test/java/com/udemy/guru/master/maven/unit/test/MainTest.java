package com.udemy.guru.master.maven.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    public void testSum() {

        var guru = new GuruPragmatic();
        var result = guru.sayHello("Douglas");
        //
        assertEquals(result, "Hi Douglas");

    }


}
