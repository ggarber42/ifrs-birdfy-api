package br.edu.ifrs.birdfly.birdfly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Ave implements Serializable {

    @Id
    private Long id;

    @NotNull
    private String nome;

    public Ave() {}

    public Ave(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
