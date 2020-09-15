package com.gabb.study.reverseproxy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class PilotController {
    //exchange pilot-service...

    private RestTemplate restTemplate;

    public PilotController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("**")
    public ResponseEntity<String> getPilots(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return restTemplate.exchange(
                "http://pilot-service" + request.getRequestURI(), HttpMethod.GET, null, String.class);
    }

}
