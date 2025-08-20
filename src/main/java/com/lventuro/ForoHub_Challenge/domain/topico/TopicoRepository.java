package com.lventuro.ForoHub_Challenge.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicoRepository {

    List<Topico> findTop10ByOrderByFechaCreacionDesc();
    List<Topico> buscarTopicosPorTituloYAnio(String nombre, int anio);
    Boolean existsById(Long id);
    Optional<Topico> findById(Long id);
    Page<Topico> buscarTodos(Pageable paginacion);
    Optional<Topico> guardarTopico(Topico topico);
    Optional<Topico> actualizarTopico(Topico topico);
    void eliminarTopico(Topico topico);

}
