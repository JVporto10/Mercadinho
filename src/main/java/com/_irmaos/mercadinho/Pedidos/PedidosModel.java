package com._irmaos.mercadinho.Pedidos;

import com._irmaos.mercadinho.Clientes.ClientesModel;
import com._irmaos.mercadinho.Produtos.ProdutosModel;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_Pedidos")
public class PedidosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "Cliente_id")
    private ClientesModel clientesModel;// puxa o relacionamento clienteModel

    @ManyToMany
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<ProdutosModel> produtosModelList;

    private LocalDateTime DataPedidos;

    @Enumerated(EnumType.STRING)
    private StatusPedidos status;

    public PedidosModel() {
    }

    public PedidosModel(StatusPedidos status, LocalDateTime dataPedidos) {
        this.status = status;
        DataPedidos = dataPedidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClientesModel getClientesModel() {
        return clientesModel;
    }

    public void setClientesModel(ClientesModel clientesModel) {
        this.clientesModel = clientesModel;
    }

    public List<ProdutosModel> getProdutosModelList() {
        return produtosModelList;
    }

    public void setProdutosModelList(List<ProdutosModel> produtosModelList) {
        this.produtosModelList = produtosModelList;
    }

    public LocalDateTime getDataPedidos() {
        return DataPedidos;
    }

    public void setDataPedidos(LocalDateTime dataPedidos) {
        DataPedidos = dataPedidos;
    }

    public StatusPedidos getStatus() {
        return status;
    }

    public void setStatus(StatusPedidos status) {
        this.status = status;
    }
}
