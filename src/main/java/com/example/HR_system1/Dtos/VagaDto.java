package com.example.HR_system1.Dtos;

public class VagaDto {


    private int id;
    private String nome;
    private String endereco;
    private String modalidade;
    private String empresa;
    private String descricao;
    private int salario;
    private int numDeVagas;
    private String formacaoAcademica;
    private String responsabiidadesEAtribuicoes;


    public VagaDto(String nome, String endereco, String modalidade, String descricao, String empresa, int salario, int numDeVagas, String formacaoAcademica, String responsabiidadesEAtribuicoes) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.modalidade = modalidade;
        this.descricao = descricao;
        this.empresa = empresa;
        this.salario = salario;
        this.numDeVagas = numDeVagas;
        this.formacaoAcademica = formacaoAcademica;
        this.responsabiidadesEAtribuicoes = responsabiidadesEAtribuicoes;
    }

    public int getNumDeVagas() {
        return numDeVagas;
    }

    public void setNumDeVagas(int numDeVagas) {
        this.numDeVagas = numDeVagas;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getResponsabiidadesEAtribuicoes() {
        return responsabiidadesEAtribuicoes;
    }

    public void setResponsabiidadesEAtribuicoes(String responsabiidadesEAtribuicoes) {
        this.responsabiidadesEAtribuicoes = responsabiidadesEAtribuicoes;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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
