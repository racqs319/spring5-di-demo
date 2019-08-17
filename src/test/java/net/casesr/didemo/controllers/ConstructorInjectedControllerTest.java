package net.casesr.didemo.controllers;

import net.casesr.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(
                new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assertions.assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }

}
