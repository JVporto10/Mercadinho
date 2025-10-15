package com._irmaos.mercadinho.Produtos;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping
public class ProdutosController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/produtos")
    public String produtos(){return "produtos";}

}