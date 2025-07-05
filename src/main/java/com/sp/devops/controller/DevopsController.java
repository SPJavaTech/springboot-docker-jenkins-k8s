package com.sp.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok("Application where jenkin build is running which package jar + build docker image + run docker application.");
    }

}
