package com.pruebaSofka.co.controller;

import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.pruebaSofka.co.entity.Audit;
import com.pruebaSofka.co.service.IAuditService;

import reactor.core.publisher.Mono;

@CrossOrigin(origins= {"http://localhost:4500"})
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	
	 @Autowired
	    private IAuditService auditService;

	    @Autowired
	    private RabbitTemplate rabbitTemplate;

	    @PostMapping("/login")
	    @ResponseStatus(HttpStatus.OK)
	    public Mono<String> login(@RequestParam String username) {
	        Audit audit = new Audit();
	        audit.setUsername(username);
	        audit.setAction("LOGIN");
	        audit.setTimestamp(LocalDateTime.now());

	        rabbitTemplate.convertAndSend("auditExchange", "auditRoutingKey", audit);

	        return auditService.save(audit).map(a -> "Login successful");
	    }

	    @PostMapping("/logout")
	    @ResponseStatus(HttpStatus.OK)
	    public Mono<String> logout(@RequestParam String username) {
	        Audit audit = new Audit();
	        audit.setUsername(username);
	        audit.setAction("LOGOUT");
	        audit.setTimestamp(LocalDateTime.now());

	        rabbitTemplate.convertAndSend("auditExchange", "auditRoutingKey", audit);

	        return auditService.save(audit).map(a -> "Logout successful");
	    }
}
