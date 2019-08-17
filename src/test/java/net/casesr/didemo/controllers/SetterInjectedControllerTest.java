package net.casesr.didemo.controllers;

import net.casesr.didemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        Assertions.assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }

}
