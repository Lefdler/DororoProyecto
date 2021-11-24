package com.proyecto.dororo.repository;

import com.proyecto.dororo.model.Demonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemonioRepository extends JpaRepository<Demonio, Long> {
    void deleteDemonioById(Long id);

    Optional<Demonio> findDemonioById(Long id);
}
