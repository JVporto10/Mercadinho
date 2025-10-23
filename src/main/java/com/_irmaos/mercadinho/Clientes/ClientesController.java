package com._irmaos.mercadinho.Clientes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientesController {
    private final ClientesService service;

}
