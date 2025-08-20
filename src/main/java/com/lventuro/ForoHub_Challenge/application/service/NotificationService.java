package com.lventuro.ForoHub_Challenge.application.service;

import com.lventuro.ForoHub_Challenge.domain.topico.Topico;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyNewTopic(Topico topico) {
        System.out.println("Notificando sobre el nuevo tópico: " + topico.getTitulo());
    }
}

