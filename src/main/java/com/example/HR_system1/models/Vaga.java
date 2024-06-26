package com.example.HR_system1.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
@RestController
@RequestMapping("vaga")
public class Vaga {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    private String nome;

    private String descricao;

    private String data;

    private String salario;

    private String endereco;

    private String modalidade;

    private String formacaoAcademica;

    private int numDeVagas;

    private String responsabilidadeEAtribuicoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    // Getters e Setters


    public String getFormaçãoAcademica() {
        return formacaoAcademica;
    }

    public void setFormaçãoAcademica(String formaçãoAcademica) {
        this.formacaoAcademica = formaçãoAcademica;
    }

    public int getNumDeVagas() {
        return numDeVagas;
    }

    public void setNumDeVagas(int numDeVagas) {
        this.numDeVagas = numDeVagas;
    }

    public String getResponsabilidadeEAtribuicoes() {
        return responsabilidadeEAtribuicoes;
    }

    public void setResponsabilidadeEAtribuicoes(String responsabilidadeEAtribuicoes) {
        this.responsabilidadeEAtribuicoes = responsabilidadeEAtribuicoes;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLocalidade() {
        return endereco;
    }

    public void setLocalidade(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
