package com.forohub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        boolean status,
        String respuesta
) {
}
