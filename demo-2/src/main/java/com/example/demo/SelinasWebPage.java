package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController("/")
public class SelinasWebPage {

    double hi = 4d;
    Double hi2;

    @GetMapping("hello")
    public String hello() {

        return "Hello " + thingIneedtoknow();
    }
    @GetMapping("goodbye/{name}")
    public String goodbye(@PathVariable("name") String aName) {

        return "Goodbye " + aName;
    }

    private String thingIneedtoknow() {
        return "Selina";
    }
}
