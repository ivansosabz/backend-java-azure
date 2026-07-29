package com.ivan.empresabackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // esto es para que se generen a partir de 1 en adelante automáticamente
    private Long id;

    @NotBlank // paque que no acepte datos nulos
    @Column(nullable = false, length = 120)
    private String nombre;

    @Email
    @NotBlank
    @Column(nullable = false, length = 120)
    private String email;

    // constructores
    public ClienteEntity() {}
    public ClienteEntity(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    // getters
    public Long getId() {return id;}
    public String getNombre() {return nombre;}
    public String getEmail() {return email;}
    // setters
    public void setId(Long id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEmail(String email) {this.email = email;}
}
