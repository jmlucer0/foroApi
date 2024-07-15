package com.forohub.api.domain.topico;

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
