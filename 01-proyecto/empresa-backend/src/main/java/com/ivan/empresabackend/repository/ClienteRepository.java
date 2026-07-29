package com.ivan.empresabackend.repository;

import com.ivan.empresabackend.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    Optional<ClienteEntity> findByEmail(String email); // esto puede devolver un ClienteEntity o un null en si el email no exite
}
