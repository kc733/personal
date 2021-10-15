package com.fomin.java.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest { 

    @Test
    public void shouldReturnHelloWorld(){

        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld() );
        print("Hello World")

    }
}
