package com.platzi.market.web.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// anotacion SpringBootApplication que es la clase que debe ejecutar  
@SpringBootApplication 
@RestController
public class PlatziMarketApplication {

    public static void main(String[] args) {
      SpringApplication.run(PlatziMarketApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}