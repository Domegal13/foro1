package com.alura.foro.controller;

import com.alura.foro.medico.DatosRegistroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        System.out.println("El request llega correctamente");
        System.out.println(datosRegistroTopico);


    }
}
