package com.estudo.service;

import com.estudo.entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> listarTodos();

    Cliente listarUmCliente(Long id);

    Cliente salvarCliente(Cliente cliente);

    Cliente editarCliente(Cliente cliente);
}
