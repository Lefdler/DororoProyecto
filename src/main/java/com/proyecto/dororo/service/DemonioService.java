package com.proyecto.dororo.service;

import com.proyecto.dororo.exception.UserNotFoundException;
import com.proyecto.dororo.model.Demonio;
import com.proyecto.dororo.repository.DemonioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class DemonioService {
    private final DemonioRepository demonioRepository;

    @Autowired
    public DemonioService(DemonioRepository demonioRepository) {
        this.demonioRepository = demonioRepository;
    }

    public Demonio addDemonio(Demonio demonio){
        return demonioRepository.save(demonio);
    }

    public List<Demonio> findAllDemonios(){
        return demonioRepository.findAll();
    }

    public Demonio updateDemonio(Demonio demonio){
        return demonioRepository.save(demonio);
    }

    public Demonio findDemonioById(Long id){
        return demonioRepository.findDemonioById(id)
                .orElseThrow(() -> new UserNotFoundException("El id " + id + " del demonio no fue encontrado"));
    }

    public void deleteDemonio(Long id){
        demonioRepository.deleteDemonioById(id);
    }

}
