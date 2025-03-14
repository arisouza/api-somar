package com.example.primeiro_projeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem vindo, " + nome + "!";
    }
    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable String num1, @PathVariable String num2) {
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int resultado = numero1 + numero2;
        return "O resultado da soma de " + numero1 + " + " + numero2 + " é " + resultado;
    }
    
}
