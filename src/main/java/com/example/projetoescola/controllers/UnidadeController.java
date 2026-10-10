package com.example.projetoescola.controllers;

import com.example.projetoescola.dtos.Unidades.UnidadeAtualizarDto;
import com.example.projetoescola.dtos.Unidades.UnidadeCriarDto;
import com.example.projetoescola.models.Unidade;
import com.example.projetoescola.services.UnidadeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades")
public class UnidadeController {
    private final UnidadeService service;

    public UnidadeController(UnidadeService service){
        this.service = service;
    }

    @GetMapping
    public List<Unidade> Listar(){
        return service.listar();
    }

    @PostMapping
    public Unidade criar(@RequestBody @Valid UnidadeCriarDto dto){
        return service.criar(dto);
    }

    @PutMapping("/{id}")
    public  Unidade atualizar(@PathVariable int id, @RequestBody @Valid UnidadeAtualizarDto dto){
        return service.atualizar(id, dto);
    }

    @GetMapping("/{id}")
    public Unidade obterPorId(@PathVariable int id){
        return service.obterPorId(id);
    }
}
