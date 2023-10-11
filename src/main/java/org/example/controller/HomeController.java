package org.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World!!!";
    }

    @GetMapping("/getUserAgent")
    public String getUserAgent(@RequestHeader HttpHeaders headers) {
        return headers.getFirst("user-agent");
    }
}
