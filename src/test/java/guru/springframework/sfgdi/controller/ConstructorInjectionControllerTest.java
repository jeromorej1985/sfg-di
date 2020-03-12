package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {
    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectionController.getGreeting());
    }
}