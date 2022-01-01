package br.edu.ifrs.birdfy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String nome;
    private String accountType;
    private String curso;
    private String instituicao;

}
