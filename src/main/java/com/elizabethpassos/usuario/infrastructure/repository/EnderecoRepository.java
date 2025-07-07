package com.elizabethpassos.usuario.infrastructure.repository;

import com.elizabethpassos.aprendendospring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
