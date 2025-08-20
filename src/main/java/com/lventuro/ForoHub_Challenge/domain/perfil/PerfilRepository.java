package com.lventuro.ForoHub_Challenge.domain.perfil;

import java.util.Optional;

public interface PerfilRepository {
    Perfil guardar(Perfil perfil);
    Optional<Perfil> encontrarPorId(Long Id);

}
