package com.alura.foro.topico;

import com.alura.foro.curso.Curso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopicos(

        @NotNull
        Long id,
        String mensaje,
        String titulo,
        Curso curso
) {
}
