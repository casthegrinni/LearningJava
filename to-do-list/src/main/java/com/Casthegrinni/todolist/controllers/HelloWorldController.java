package com.Casthegrinni.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Avisar que é um controller, além de uma classe
@SuppressWarnings("unused") // Fazer o aviso não aparecer

public class HelloWorldController {

    // Tenho uma rota get dentro da hello (mas ainda não tem nenhum url). A porta padrão é a 8080/
    @GetMapping("/hello")
    public String hello() {
        return "world";
    }

    @GetMapping("/hello-from")
    public String helloFrom(
            // @RequestParam("first_name") String firstName,
            // @RequestParam("last_name") String lastName

            @RequestParam String firstName,
            @RequestParam String lastName

            //http://localhost:8080/hello-from?firstName=teodor&lastName=teodosio
    ) {
        return "Olá " + firstName + " " + lastName;
    }

    @GetMapping("/hello-from/{name}")
    public String helloFromPath(
            @PathVariable String name
    ) {
        return "Olá " + name;
    }
}
