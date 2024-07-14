package com.alura.foro.topico;

import com.alura.foro.curso.Curso;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        Boolean status,
        String autor,
        String curso
) {
}
