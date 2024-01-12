package com.boki.wstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// Spring WebFlux 예제
@RestController
public class WebFluxController {
    private final WebClient webClient = WebClient.create("http://localhost:3000");

    @GetMapping("/webflux-request")
    public Mono<String> makeRequest() {
        // Express 서버로 비동기 요청
        System.out.println("Call express /delay");
        return webClient.get()
                .uri("/delay")
                .retrieve()
                .bodyToMono(String.class);
    }
}
