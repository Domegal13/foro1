package com.alura.foro.domain.topico;

import com.alura.foro.domain.curso.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Curso curso,
        @NotBlank
        String autor

      ){
}
//        @NotNull
//        @JsonFormat(pattern = "dd/MM/yy HH:mm")
//        LocalDateTime fechaCreacion,
//        @NotBlank
//        Boolean status,