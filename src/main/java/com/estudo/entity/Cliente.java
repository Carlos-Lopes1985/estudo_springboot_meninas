package com.estudo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    //protected, public, default, private - estudar
    // Tipos dos atributos - Long, Integer, Double, Float e etc... - estudar
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String cpfCnpj;
    private LocalDate dataNascimento;

    public Cliente() {
    }

    //Entrada de dados
    public Cliente(Long id, String name, String cpfCnpj, LocalDate dataNascimento) {
        this.id = id;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
