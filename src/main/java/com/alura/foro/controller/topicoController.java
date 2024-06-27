package com.alura.foro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class topicoController {

    @PostMapping
    public void agregarTopico(@RequestBody String parametro){
        System.out.println("El request llega correctamente");
        System.out.println(parametro);
        System.out.println(parametro);
    }
}
