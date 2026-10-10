package com.example.projetoescola.services;

import com.example.projetoescola.config.enums.Status;
import com.example.projetoescola.dtos.Professores.ProfessorAtualizarDto;
import com.example.projetoescola.dtos.Professores.ProfessorCriarDto;
import com.example.projetoescola.models.Professor;
import com.example.projetoescola.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository){
        this.repository = repository;
    }

    public List <Professor> listar(){
        return this.repository.findAll();
    }

    public Professor criar(ProfessorCriarDto dado){
        var profrssor = Professor.builder()
                .nome(dado.nome())
                .build();

        return this.repository.save(profrssor);
    }

    public Professor atualizar(int id, ProfessorAtualizarDto dado){
        var professor = repository.findById(id).orElseThrow();

        professor.setNome(dado.nome());

        return repository.save(professor);

    }

    public Professor mudarStatus(int id){
        var professor = repository.findById(id).orElseThrow();

        if (professor.getStatsu() == Status.ATIVO){
            professor.setStatsu(Status.INATIVO);
        }else {
            professor.setStatsu(Status.ATIVO);
        }

        return repository.save(professor);
    }

    public Professor obterPorId(int id){
        var professor = repository.findById(id).orElseThrow();
        return professor;
    }
}
