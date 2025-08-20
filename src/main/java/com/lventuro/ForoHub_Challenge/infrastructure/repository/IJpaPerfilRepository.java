package com.lventuro.ForoHub_Challenge.infrastructure.repository;

import com.lventuro.ForoHub_Challenge.domain.perfil.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IJpaPerfilRepository extends JpaRepository<Perfil, Long> {

    Optional<Perfil> findByNombre(String nombreDelPerfil);
    Optional<Perfil> findById(Long Id);
}