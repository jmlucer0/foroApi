package com.forohub.api.DTO;

import com.forohub.api.entity.Topico;

public record DatosListaTopico(
        Long id,
        String titulo,
        boolean status,
        String autor,
        String respuesta
) {
    public DatosListaTopico(Topico topico){
       this(topico.getId(), topico.getTitulo(), topico.isStatus(), topico.getAutor(), topico.getRespuesta());
    }
}
