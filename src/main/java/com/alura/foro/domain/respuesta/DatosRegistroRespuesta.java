//package com.alura.foro.respuesta;
//
//import com.alura.foro.usuario.DatosRegistroUsuario;
//import com.alura.foro.usuario.Usuario;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.validation.Valid;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public record DatosRegistroRespuesta(
//        @NotBlank
//        String message,
//        @NotNull
//        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
//        LocalDateTime fechaCreacion,
//        @NotNull Boolean solution,
//        @NotNull
//        @Valid
//        DatosRegistroUsuario datosRegistroUsuario
//) {
//}
