package com._irmaos.mercadinho;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MercadinhoController {

    @GetMapping("/BemVindo")
    public String bemVindo() {
        return "primeiro getMapping, bem vindo.";
    }
}