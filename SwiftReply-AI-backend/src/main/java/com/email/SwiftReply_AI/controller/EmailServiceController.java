package com.email.SwiftReply_AI.controller;


import com.email.SwiftReply_AI.Entity.EmailRequest;
import com.email.SwiftReply_AI.Services.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailServiceController {

    @Autowired
    private final EmailService emailService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response=emailService.generateEmailReply(emailRequest);

        return ResponseEntity.ok(response);
    }
}
