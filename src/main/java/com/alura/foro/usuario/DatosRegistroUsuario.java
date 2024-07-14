//package com.alura.foro.usuario;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
//
//public record DatosRegistroUsuario(
//        @NotBlank
//        String nombre,
//        @NotBlank
//        @Email
//        String email,
//        @NotBlank
//        @Pattern(regexp = "^ (?= . *? [A - Z] ) (?= . *? [a - z] ) (?= . *? [0 - 9] ) (?= . *? [#?!@$ %^&*-] ) . {8,} $", message = "Debe se alfanumerico con 8 caracteres como mínimo")
//        String password
//) {
//}
