package com.example.HR_system1.Dtos;

public class VagaDto {


    private int id;
    private String nome;
    private String endereco;
    private String modalidade;
    private String empresa;
    private String descricao;


    public VagaDto(String nome, String endereco, String modalidade, String empresa, String descricao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.modalidade = modalidade;
        this.empresa = empresa;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
