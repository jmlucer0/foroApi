package com.forohub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;


public record DatosRegistroTopico(

        @NotBlank
        String titulo,

        boolean status,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotBlank
        String respuesta

) {
}
