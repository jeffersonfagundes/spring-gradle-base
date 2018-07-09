package br.com.exemplo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploRest {
	
	@RequestMapping("/")
    public String exemplo() {
        return "Request Spring Boot complete!";
    }
}
