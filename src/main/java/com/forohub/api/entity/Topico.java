package com.forohub.api.entity;

import com.forohub.api.DTO.DatosActualizarTopico;
import com.forohub.api.DTO.DatosRegistroTopico;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private LocalDate fechaCreacion;
    private String autor;
    private String curso;
    private String respuesta;
    private boolean status;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.fechaCreacion = LocalDate.now();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.respuesta = datosRegistroTopico.respuesta();
        this.status = false;
    }

    public void actualizarDatos(DatosActualizarTopico actualizarTopico){
        if (actualizarTopico.titulo() != null){
            this.titulo = actualizarTopico.titulo();
        }
        if (actualizarTopico.respuesta() != null){
            this.respuesta = actualizarTopico.respuesta();
        }
        this.status = actualizarTopico.status();
    }
}
