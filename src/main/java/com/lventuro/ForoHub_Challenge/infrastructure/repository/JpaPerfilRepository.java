package com.lventuro.ForoHub_Challenge.infrastructure.repository;

import com.lventuro.ForoHub_Challenge.domain.perfil.Perfil;
import com.lventuro.ForoHub_Challenge.domain.perfil.PerfilRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Clase que implementa la interfaz de dominio PerfilRepository.
 * Utiliza la interfaz de JPA (IJpaPerfilRepository) para la persistencia.
 * Esta clase actúa como un adaptador, convirtiendo entre los objetos
 * del dominio y las entidades de persistencia.
 */
@Repository
public class JpaPerfilRepository implements PerfilRepository {

    private final IJpaPerfilRepository jpaRepository;

    public JpaPerfilRepository(IJpaPerfilRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    @Override
    public Optional<Perfil> encontrarPorId(Long id) {
        return jpaRepository.findById(id)
                .map(this::convertirAEntidadDominio);
    }

    @Override
    public Perfil guardar(Perfil perfilDominio) {
        var perfilPersistencia = new Perfil();
        perfilPersistencia.setNombre(perfilDominio.getNombre());

        var perfilGuardado = jpaRepository.save(perfilPersistencia);

        return convertirAEntidadDominio(perfilGuardado);
    }

    /**
     * Método de conversión de objeto de persistencia a objeto de dominio.
     * @param perfilPersistencia La entidad de persistencia.
     * @return El objeto de dominio.
     */
    public Perfil convertirAEntidadDominio(Perfil perfilPersistencia) {
        return new Perfil(
                perfilPersistencia.getId(),
                perfilPersistencia.getNombre()
        );
    }
}
