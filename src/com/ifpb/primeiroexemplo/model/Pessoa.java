package com.ifpb.primeiroexemplo.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    // Atributo static pertence a classe
    private static int contPessoa;

    // atributos pertencem ao objeto
    private final int ID;
    private String cpf;
    private String rg;
    private String nome;
    private LocalDate nascimento;
    private Endereco endereco;

    public Pessoa(String cpf, String rg, String nome,
                  LocalDate nascimento, Endereco endereco){
        ID = ++contPessoa;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }

    public Pessoa() {
        ID = ++contPessoa;
    }

    public int getID(){
        return ID;
    }

    public static int getContPessoa(){
        return contPessoa;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public int getIdade(){
        Period period = Period.between(nascimento,
                LocalDate.now());

        return period.getYears();
    }

}