package com.udemy.guru.master.maven.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class MainTest {


    @Test
    public void doIt() {

        var rnd = new Random();
        var avg = IntStream.rangeClosed(1, 6)
                .map(rnd::nextInt)
                .average();

        Assertions.assertTrue(avg.isPresent());

    }
}
