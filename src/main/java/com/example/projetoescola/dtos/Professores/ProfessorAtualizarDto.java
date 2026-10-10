package com.example.projetoescola.dtos.Professores;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProfessorAtualizarDto (
        @Schema(description = "Nome do professor")
        @NotBlank
        @Size(min = 3, max = 150)
        String nome
){
}
