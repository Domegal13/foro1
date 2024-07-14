//package com.alura.foro.usuario;
//
//import com.alura.foro.respuesta.Respuesta;
//import com.alura.foro.topico.Topico;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "usuarios")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class Usuario {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    String nombre;
//    private String email;
//    private String password;
//
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Topico> topics = new ArrayList<>();
//
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Respuesta> responses = new ArrayList<>();
//
//    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
//        this.nombre = datosRegistroUsuario.nombre();
//        this.email = datosRegistroUsuario.email();
//        this.password = datosRegistroUsuario.password();
//    }
//
//    public Usuario updateUsuario(DatosRegistroUsuario usuario) {
//        this.nombre = usuario.nombre();
//        this.email = usuario.email();
//        this.password = usuario.password();
//        return this;
//    }

//
//}

