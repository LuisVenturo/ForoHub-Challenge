package com.lventuro.ForoHub_Challenge.infrastructure.repository;

import com.lventuro.ForoHub_Challenge.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IJpaUsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreoElectronico(String correoElectronico);

}
