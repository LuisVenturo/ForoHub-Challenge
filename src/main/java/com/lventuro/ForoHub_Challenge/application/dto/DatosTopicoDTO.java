package com.lventuro.ForoHub_Challenge.application.dto;

import com.lventuro.ForoHub_Challenge.domain.topico.Topico;

import java.time.LocalDateTime;

public record DatosTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        Long autor,
        Long curso
) {
    public DatosTopicoDTO(Topico topico) {
        this(topico.getId(), topico.getTitulo(),topico.getMensaje(),topico.getFechaCreacion(),
                topico.getStatus(),topico.getAutor(), topico.getCurso());
    }

}
