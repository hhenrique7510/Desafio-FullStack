package com.Henrique.Desafio.Usuarios;

import jakarta.persistence.*;

@Table(name = "Usuarios")
@Entity(name = "Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String cpf;
    private String nome;
    private String endereco;
    private String idade;
    private String corfavorita;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCorfavorita() {
        return corfavorita;
    }

    public void setCorfavorita(String corfavorita) {
        this.corfavorita = corfavorita;
    }
}
