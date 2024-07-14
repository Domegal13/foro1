package com.alura.foro.topico;


import com.alura.foro.curso.Curso;
import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fecha;
    private Boolean status;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;



    public Topico (DatosRegistroTopico datosRegistroTopico){
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fecha =  LocalDateTime.now().format(formatter);
        this.status = true;
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();

       ;
    }


    public void actualizarDatos(DatosActualizarTopicos datosActualizarTopico) {

        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.curso()!= null) {
            this.curso = datosActualizarTopico.curso();
        }
    }

    public void desactivarTopico() {
        this.status = false;
    }


}
