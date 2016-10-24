package com.smattern.service;

import org.junit.Assert;

/**
 * @author smattern
 */
public class HelloWorldServiceTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void sayHello() throws Exception {
        final HelloWorldService service = new HelloWorldService();
        final String hello = service.sayHello();
        Assert.assertNotNull(hello);
        Assert.assertEquals("hell", hello);
    }
}