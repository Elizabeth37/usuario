package com.elizabethpassos.usuario.infrastructure.security.repository;

import com.elizabethpassos.aprendendospring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
