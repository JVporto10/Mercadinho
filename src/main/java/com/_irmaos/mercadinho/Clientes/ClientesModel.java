package com._irmaos.mercadinho.Clientes;

import com._irmaos.mercadinho.Pedidos.PedidosModel;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ClientesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String endereço;
    private String contato;

    private LocalDateTime data_cadastro;

    @OneToMany(mappedBy = "Cliente")
    private List<PedidosModel> pedidosModelList;

    public ClientesModel() {
    }

    public ClientesModel(String nome, String email, String senha, String endereço, String contato, LocalDateTime data_cadastro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereço = endereço;
        this.contato = contato;
        this.data_cadastro = data_cadastro;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public List<PedidosModel> getPedidosModelList() {
        return pedidosModelList;
    }

    public void setPedidosModelList(List<PedidosModel> pedidosModelList) {
        this.pedidosModelList = pedidosModelList;
    }
}
