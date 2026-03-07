package com.va4815.k8sproductservice.controller;

import com.va4815.k8sproductservice.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting() {
        String greeting = "Hello from K8s Product Service";
        logger.info(greeting);
        return new Greeting(counter.incrementAndGet(), greeting);
    }

}
