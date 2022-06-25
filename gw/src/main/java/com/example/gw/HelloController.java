package com.example.gw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {
    @GetMapping(path = "/unsecured")
    public static final Mono<String> unsecured() {
        return Mono.just("hi unsecured");
    }

    @GetMapping(path = "/secured")
    public static final Mono<String> secured() {
        return Mono.just("HELLO SECURED !");
    }
}
