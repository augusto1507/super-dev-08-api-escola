package com.example.projetoescola.models;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "unidades")
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 120, nullable = false, unique = true)
    private String nome;

    @Column(length = 10, nullable = false, unique = true)
    private String codigo;

    @PrePersist
    public void correcaoCodigo(){
        if (codigo != null){
            codigo = codigo.trim().toUpperCase();
        }
    }
}
