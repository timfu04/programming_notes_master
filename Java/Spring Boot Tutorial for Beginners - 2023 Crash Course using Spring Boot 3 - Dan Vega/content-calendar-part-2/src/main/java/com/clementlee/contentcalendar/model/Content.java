package com.clementlee.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank // Bean validation - title cannot be blank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
