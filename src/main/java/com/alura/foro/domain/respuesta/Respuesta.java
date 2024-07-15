//package com.alura.foro.respuesta;
//
//import com.alura.foro.topico.Topico;
//import com.alura.foro.usuario.Usuario;
//import jakarta.persistence.*;
//import jakarta.validation.Valid;
//import lombok.*;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "respuestas")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode(of = "id")
//public class Respuesta {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String mensaje;
//    private LocalDateTime fechaCreacion;
//    private Boolean solucion;
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "topico_id", referencedColumnName = "id")
//    private Topico topico;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
//    private Usuario usuario;
//
//
// public Respuesta(DatosRegistroRespuesta datosRegistroRespuesta, Topico topico) {
//  this.mensaje = datosRegistroRespuesta.message();
//  this.fechaCreacion=datosRegistroRespuesta.fechaCreacion();
//  this.solucion=datosRegistroRespuesta.solution();
//  this.topico = topico;
//  this.usuario = new Usuario(datosRegistroRespuesta.datosRegistroUsuario());
// }
//
//}
