package com.estudo.service;


import com.estudo.entity.Cliente;
import com.estudo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    //Estudar Optional
    @Override
    public Cliente listarUmCliente(Long id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {
      return  clienteRepository.save(cliente);
    }

}
