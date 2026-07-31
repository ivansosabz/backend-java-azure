package com.ivan.empresabackend.controller;

import com.ivan.empresabackend.entity.ClienteEntity;
import com.ivan.empresabackend.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.net.URI;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @GetMapping
    public List<ClienteEntity> listar() {
        return clienteService.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClienteEntity> buscarPorId(@PathVariable Long id) {
        return clienteService.obtenerPorId(id).
                map(ResponseEntity::ok).
                orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<ClienteEntity> crear(@Valid @RequestBody ClienteEntity cliente) {
        ClienteEntity creado = clienteService.crear(cliente);
        return ResponseEntity.created(URI.create("/api/clientes"+creado.getId())).body(creado);
    }
    // PUT /api/clientes/{id} -> actualiza los datos de un cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<ClienteEntity> actualizar(@PathVariable Long id, @Valid @RequestBody ClienteEntity cliente) {
        // Si el cliente no existe, el servicio devuelve Optional.empty() -> 404
        return clienteService.actualizar(id, cliente)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        try {
            clienteService.eliminar(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
