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
public class Ave{

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String especie;
    private String dataRegistro;

}
