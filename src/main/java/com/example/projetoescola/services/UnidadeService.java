package com.example.projetoescola.services;

import com.example.projetoescola.dtos.Unidades.UnidadeAtualizarDto;
import com.example.projetoescola.dtos.Unidades.UnidadeCriarDto;
import com.example.projetoescola.models.Unidade;
import com.example.projetoescola.repositories.UnidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeService {
    private final UnidadeRepository repository;

    public UnidadeService (UnidadeRepository repository){
        this.repository = repository;
    }

    public List<Unidade> listar(){return  this.repository.findAll();}

    public Unidade criar(UnidadeCriarDto dado){
        var unidade = Unidade.builder()
                .nome(dado.nome())
                .codigo(dado.codigo())
                .build();

        return this.repository.save(unidade);
    }

    public  Unidade atualizar(int id, UnidadeAtualizarDto dado){
        var unidade = repository.findById(id).orElseThrow();

        unidade.setNome(dado.nome());

        return repository.save(unidade);
    }

    public Unidade obterPorId(int id){
        var unidade = repository.findById(id).orElseThrow();
        return unidade;
    }



}
