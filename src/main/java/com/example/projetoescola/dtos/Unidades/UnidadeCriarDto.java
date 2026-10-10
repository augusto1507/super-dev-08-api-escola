package com.example.projetoescola.dtos.Unidades;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UnidadeCriarDto (
    @Schema(description = "Define nome da unidade", example = "Escola dos maneiros")
    @NotBlank @Size(min = 3, max = 120)
    String nome,

    @Schema(description = "Define o codigo da unidade", example = "SC0001")
    @NotBlank @Size(min = 2, max = 10)
    String codigo
    )
{}

