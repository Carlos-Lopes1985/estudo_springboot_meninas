package com.estudo.resource;

import com.estudo.entity.Cliente;
import com.estudo.repository.ClienteRepository;
import com.estudo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {

    //localhost:8080/clientes

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>>buscarTodos(){
        return ResponseEntity.ok(clienteService.listarTodos());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Cliente>buscarUmCliente( @PathVariable  Long id){

        System.out.println("Passou aki!");

        return ResponseEntity.ok(clienteService.listarUmCliente(id));
    }

    @PostMapping
    public ResponseEntity<?>salvarCliente( @RequestBody Cliente cliente){

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                                             .path("/{id}")
                                             .buildAndExpand(cliente.getId())
                                             .toUri();

        return ResponseEntity.created(uri).body(clienteService.salvarCliente(cliente));
    }

    @PutMapping
    public ResponseEntity<?>editarCliente( @RequestBody Cliente cliente){

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cliente.getId())
                .toUri();

        return ResponseEntity.created(uri).body(clienteService.editarCliente(cliente));
    }
}
