package com.alura.foro.domain.autor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Autor")
@Table(name = "autores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String email;
    private String password;


    public Autor(DatosRegistroAutor datosRegistroAutor){
        this.nombre=datosRegistroAutor.nombre();
        this.email= datosRegistroAutor.email();
        this.password= datosRegistroAutor.password();
    }


}
