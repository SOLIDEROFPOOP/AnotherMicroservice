package org.example.eurekaclient.controller;

import jakarta.ws.rs.GET;
import org.example.eurekaclient.dto.HumanDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/main")
public class TestController {
    @Value("${eureka.instance.instance-id}")
    private String port;
    @Autowired
    private WebClient.Builder webClientBuilder;
    @GetMapping("/test")
    public String test(){
        return port;
    }

    @PostMapping("/add")
    private String addHuman(@RequestBody HumanDto humanDto){
        return webClientBuilder.build().post()
                .uri("http://people-service/api/people/add")
                .bodyValue(humanDto)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
