package com.alura.foro.domain.topico;

import com.alura.foro.domain.curso.Curso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopicos(

        @NotNull
        Long id,
        String mensaje,
        String titulo,
        Curso curso
) {
}
