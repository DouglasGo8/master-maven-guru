package com.udemy.guru.master.maven.unit.test;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MainTest {


  @Test
  public void testAssertEquals() {

    var guru = new GuruPragmatic();
    var result = guru.sayHello("Douglas");
    //
    assertEquals(result, "Hi Douglas");

  }


}
