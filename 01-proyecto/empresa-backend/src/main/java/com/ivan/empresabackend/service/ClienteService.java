package com.ivan.empresabackend.service;

import com.ivan.empresabackend.entity.ClienteEntity;
import com.ivan.empresabackend.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    // constructor
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public List<ClienteEntity> listar() {
        return clienteRepository.findAll(); //ClienteRepository ya tiene métodos como findAll, findById, etc
    }
    public Optional<ClienteEntity> obtenerPorId(Long id) {
        return clienteRepository.findById(id);
    }
//    public Optional<ClienteEntity> obtenerPorEmail(String email) {
//        return clienteRepository.findByEmail(email);
//    }
    public ClienteEntity crear (ClienteEntity cliente) {
        clienteRepository.findByEmail(cliente.getEmail()).ifPresent(c -> {
            throw new IllegalArgumentException("ya existe un cliente con el email " + cliente.getEmail());
        });
        return clienteRepository.save(cliente);
    }

    public ClienteEntity actualizar (Long id, ClienteEntity datos) {
        ClienteEntity actual = clienteRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("no existe el cliente con el id " + id)
        );
        actual.setNombre(datos.getNombre());
        actual.setEmail(datos.getEmail());
        return clienteRepository.save(actual);
    }

    public void eliminar(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new IllegalArgumentException("no existe el cliente con el id " + id);
        }
        clienteRepository.deleteById(id);
    }
}
