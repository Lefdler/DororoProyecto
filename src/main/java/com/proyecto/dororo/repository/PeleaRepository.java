package com.proyecto.dororo.repository;

import com.proyecto.dororo.model.Pelea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeleaRepository extends JpaRepository<Pelea, Long> {
    void deletePeleaById(Long id);

    static Optional<Pelea> findPeleaById(Long id) {
        return null;
    }
}
