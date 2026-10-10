package com.example.projetoescola.dtos.Professores;

import com.example.projetoescola.config.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;

public record ProfessorStatusDto(
        @Schema(description = "Status definido como: ATIVO / INATIVO")
        Status status
) {
}
