package com._irmaos.mercadinho.Pedidos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_Pedidos")
public class PedidosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

}
