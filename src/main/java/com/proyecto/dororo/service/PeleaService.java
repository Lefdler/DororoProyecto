package com.proyecto.dororo.service;

import com.proyecto.dororo.exception.UserNotFoundException;
import com.proyecto.dororo.model.Pelea;
import com.proyecto.dororo.repository.PeleaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class PeleaService {
    private final PeleaRepository peleaRepository;

    @Autowired
    public PeleaService(PeleaRepository peleaRepository) {
        this.peleaRepository = peleaRepository;
    }

    public Pelea addPelea(Pelea pelea){
        return peleaRepository.save(pelea);
    }

    public List<Pelea> findAllPeleas(){return peleaRepository.findAll(); }

    public Pelea updatePelea(Pelea pelea){
        return peleaRepository.save(pelea);
    }

    public Pelea findPeleaById(Long id){
        return PeleaRepository.findPeleaById(id)
                .orElseThrow(() -> new UserNotFoundException("El id " + id + " de la pelea no fue encontrado"));
    }

    public void deletePelea(Long id){
        peleaRepository.deletePeleaById(id);
    }

}
