package com.proyecto.dororo.Controller;

import com.proyecto.dororo.model.Objeto;
import com.proyecto.dororo.service.ObjetoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objeto")
public class ObjetoResource {
    private final ObjetoService objetoService;

    public ObjetoResource(ObjetoService objetoService) {
        this.objetoService = objetoService;
    }

    @GetMapping("/allobjeto")
    public ResponseEntity<List<Objeto>> getAllObjetos(){
        List<Objeto> objetos = objetoService.findAllObjetos();
        return new ResponseEntity<>(objetos, HttpStatus.OK);
    }

    @GetMapping("/findobjeto/{id}")
    public ResponseEntity<Objeto> getObjetoById(@PathVariable("id") Long id){
        Objeto objeto = objetoService.findObjetoById(id);
        return new ResponseEntity<>(objeto, HttpStatus.OK);
    }

    @PostMapping("/addobjeto")
    public ResponseEntity<Objeto> addObjeto(@RequestBody Objeto objeto){
        Objeto newObjeto = objetoService.addObjeto((objeto));
        return new ResponseEntity<>(newObjeto, HttpStatus.CREATED);
    }

    @PutMapping("/updateobjeto")
    public ResponseEntity<Objeto> updateObjeto(@RequestBody Objeto objeto){
        Objeto updateObjeto = objetoService.updateObjeto((objeto));
        return new ResponseEntity<>(updateObjeto, HttpStatus.OK);
    }

    @DeleteMapping("/deleteobjeto/{id}")
    public ResponseEntity<?> deleteObjeto(@PathVariable("id") Long id){
        objetoService.deleteObjeto((id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}