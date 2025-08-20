package com.lventuro.ForoHub_Challenge.application.dto;

public record EmailRequestDTO(
        String to,
        String subject,
        String name,
        String message
) {
}
