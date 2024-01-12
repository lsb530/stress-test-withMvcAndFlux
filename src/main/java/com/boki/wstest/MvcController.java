package com.boki.wstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// Spring MVC 예제
@RestController
public class MvcController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/mvc-request")
    public String makeRequest() {
        // Express 서버로 요청
        System.out.println("Call express /delay");
        return restTemplate.getForObject("http://localhost:3000/delay", String.class);
    }
}

