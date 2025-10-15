package com._irmaos.mercadinho.Produtos;

import jakarta.persistence.*;

// trasnfroma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_Produtos")
public class ProdutosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String categoria;
    private double valor;

    public ProdutosModel(){

    }

    public ProdutosModel(String nome, String categoria, double valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
