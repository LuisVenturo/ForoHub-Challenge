package com.lventuro.ForoHub_Challenge.application.service;

import com.lventuro.ForoHub_Challenge.application.dto.DatosTokenJWT;
import com.lventuro.ForoHub_Challenge.domain.usuario.Usuario;
import com.lventuro.ForoHub_Challenge.infrastructure.config.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenGenerationService {

    @Autowired
    private TokenService tokenService;

    public DatosTokenJWT generarToken(Usuario usuarioAutenticado) {
        var tokenJWT = tokenService.generarToken(usuarioAutenticado);
        return new DatosTokenJWT(tokenJWT);
    }
}