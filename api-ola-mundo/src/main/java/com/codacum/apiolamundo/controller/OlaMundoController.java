package com.codacum.apiolamundo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class OlaMundoController {
    @GetMapping("/home")

    public String olamundo(){
        return "Ola Mundo!! Se você está vendo isso é porque Funcionou!";
    }
}
