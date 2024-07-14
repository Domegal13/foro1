package com.alura.foro.topico;

import com.alura.foro.curso.Curso;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        Boolean status,
        String fecha,
        String autor,
        String curso
) {
    public DatosListadoTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(),topico.getMensaje(), topico.getStatus(), topico.getFecha(), topico.getAutor(), topico.getCurso().toString());

    }


}
