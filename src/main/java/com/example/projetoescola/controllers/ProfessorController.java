package com.example.projetoescola.controllers;

import com.example.projetoescola.dtos.Professores.ProfessorAtualizarDto;
import com.example.projetoescola.dtos.Professores.ProfessorCriarDto;
import com.example.projetoescola.dtos.Professores.ProfessorStatusDto;
import com.example.projetoescola.models.Professor;
import com.example.projetoescola.services.ProfessorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
@Tag(name = "Professores")
public class ProfessorController {
    private final ProfessorService service;

    public ProfessorController(ProfessorService service){
        this.service = service;
    }

    @GetMapping
    public List<Professor> listar(){
        return service.listar();
    }

    @PostMapping
    public Professor criar(@RequestBody @Valid ProfessorCriarDto dado){
        return service.criar(dado);
    }

    @PostMapping("/{id}/status")
    public Professor mudarStatus(@PathVariable int id){
        return service.mudarStatus(id);
    }

    @PutMapping("/{id}")
    public Professor atualizar(@PathVariable int id, @RequestBody @Valid ProfessorAtualizarDto dado){
        return service.atualizar(id, dado);
    }

}
