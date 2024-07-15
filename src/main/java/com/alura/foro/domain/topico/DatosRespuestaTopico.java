package com.alura.foro.domain.topico;

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
