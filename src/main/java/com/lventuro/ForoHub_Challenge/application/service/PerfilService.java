package com.lventuro.ForoHub_Challenge.application.service;

import com.lventuro.ForoHub_Challenge.domain.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    PerfilRepository perfilRepository;

}
