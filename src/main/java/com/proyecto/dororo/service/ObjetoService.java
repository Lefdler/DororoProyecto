package com.proyecto.dororo.service;

import com.proyecto.dororo.exception.UserNotFoundException;
import com.proyecto.dororo.model.Objeto;
import com.proyecto.dororo.repository.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class ObjetoService {
    private final ObjetoRepository objetoRepository;

    @Autowired
    public ObjetoService(ObjetoRepository objetoRepository) {
        this.objetoRepository = objetoRepository;
    }

    public Objeto addObjeto(Objeto objeto){
        return objetoRepository.save(objeto);
    }

    public List<Objeto> findAllObjetos(){
        return objetoRepository.findAll();
    }

    public Objeto updateObjeto(Objeto objeto){
        return objetoRepository.save(objeto);
    }

    public Objeto findObjetoById(Long id){
        return objetoRepository.findObjetoById(id)
                .orElseThrow(() -> new UserNotFoundException("El id " + id + " del demonio no fue encontrado"));
    }

    public void deleteObjeto(Long id){
        objetoRepository.deleteObjetoById(id);
    }

}
