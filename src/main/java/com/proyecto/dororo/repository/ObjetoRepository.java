package com.proyecto.dororo.repository;

import com.proyecto.dororo.model.Demonio;
import com.proyecto.dororo.model.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Long> {
    void deleteObjetoById(Long id);

    Optional<Objeto> findObjetoById(Long id);
}