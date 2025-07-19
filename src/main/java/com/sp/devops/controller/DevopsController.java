package com.sp.devops.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @Value("${app.message:Default config message not found}")
    private String configMessage;

    @Value("${app.secret:Default secret not found}")
    private String secretMessage;

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        String combinedMessage = String.format(
                "✅ ConfigMap message: %s\n🔐 Secret message: %s",
                configMessage, secretMessage
        );
        return ResponseEntity.ok(combinedMessage);
    }

}
