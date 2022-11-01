package com.codacum.apiolamundo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.codacum.apiolamundo.entity.StartechEntity;
import com.codacum.apiolamundo.service.StarTechservice;



@RestController
public class OlaMundoController {
    @Autowired
    private StarTechservice starTechservice;

    @GetMapping("/home")
        public String olamundo(){
        return "Ola Mundo!! Se você está vendo isso é porque Funcionou!";
    }

    @GetMapping("/users")
    public List<StartechEntity> getAllUsers(){
        return starTechservice.getUsers();
    }

    @GetMapping("/user/{id}")
    public StartechEntity getUserById(@PathVariable int id){
        return starTechservice.getUserById(id);
    }

    @PostMapping("/addUser")
    public StartechEntity addUser(@RequestBody StartechEntity startechEntity) {
        return starTechservice.createUser(startechEntity);
    }  

    @DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return starTechservice.deleteUserById(id);
	}






}
