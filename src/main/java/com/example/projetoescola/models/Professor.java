package com.example.projetoescola.models;


import com.example.projetoescola.config.enums.Status;
import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "professores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 60, nullable = false)
    private Status statsu;

}
