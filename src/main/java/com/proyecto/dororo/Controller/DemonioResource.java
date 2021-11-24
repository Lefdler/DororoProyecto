package com.proyecto.dororo.Controller;

import com.proyecto.dororo.model.Demonio;
import com.proyecto.dororo.service.DemonioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demonio")
public class DemonioResource {
    private final DemonioService demonioService;

    public DemonioResource(DemonioService demonioService) {
        this.demonioService = demonioService;
    }

    @GetMapping("/alldemonio")
    public ResponseEntity<List<Demonio>> getAllDemonios(){
        List<Demonio> demonios = demonioService.findAllDemonios();
        return new ResponseEntity<>(demonios, HttpStatus.OK);
    }

    @GetMapping("/finddemonio/{id}")
    public ResponseEntity<Demonio> getDemonioById(@PathVariable("id") Long id){
        Demonio demonio = demonioService.findDemonioById(id);
        return new ResponseEntity<>(demonio, HttpStatus.OK);
    }

    @PostMapping("/adddemonio")
    public ResponseEntity<Demonio> addDemonio(@RequestBody Demonio demonio){
        Demonio newDemonio = demonioService.addDemonio((demonio));
        return new ResponseEntity<>(newDemonio, HttpStatus.CREATED);
    }

    @PutMapping("/updatedemonio")
    public ResponseEntity<Demonio> updateDemonio(@RequestBody Demonio demonio){
        Demonio updateDemonio = demonioService.updateDemonio((demonio));
        return new ResponseEntity<>(updateDemonio, HttpStatus.OK);
    }

    @DeleteMapping("/deletedemonio/{id}")
    public ResponseEntity<?> deleteDemonio(@PathVariable("id") Long id){
        demonioService.deleteDemonio((id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
