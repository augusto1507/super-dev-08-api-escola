package com.example.projetoescola.dtos.Unidades;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UnidadeAtualizarDto (
    @NotBlank @Size(min = 3, max = 120)
    String nome
)
{}
