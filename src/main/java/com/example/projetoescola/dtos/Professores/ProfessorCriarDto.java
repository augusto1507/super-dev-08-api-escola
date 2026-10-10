package com.example.projetoescola.dtos.Professores;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProfessorCriarDto (
    @Schema(example = "Clovis Basilio")
    @NotBlank
    @Size(min = 3, max = 150)
    String nome
)
{}
