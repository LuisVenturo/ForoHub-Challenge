package com.lventuro.ForoHub_Challenge.infrastructure.repository;

import com.lventuro.ForoHub_Challenge.domain.respuesta.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IJpaRespuestaRepository extends JpaRepository<Respuesta,Long> {
        List<Respuesta> findByTopicoId(Long topicoId);

    //Se define un método usando JPQL para realizar las consultas mas especificas
    @Query("SELECT r FROM Respuesta r WHERE r.topico.id = :topicoId AND r.solucion = true")
    Optional<Respuesta> buscarSolucionTopico(Long topicoId);

}
