package com._irmaos.mercadinho.Clientes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
    private final ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public List<ClientesModel> listarTodos(){
        return repository.findAll();
    }

    public ClientesModel salvar (ClientesModel Cliente){
        return repository.save(Cliente);
    }
}
