package com.proyecto.dororo.Controller;

import com.proyecto.dororo.model.Demonio;
import com.proyecto.dororo.model.Pelea;
import com.proyecto.dororo.service.DemonioService;
import com.proyecto.dororo.service.PeleaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pelea")
public class PeleaResource {
    private final PeleaService peleaService;

    public PeleaResource(PeleaService peleaService) {
        this.peleaService = peleaService;
    }

    @GetMapping("/allpelea")
    public ResponseEntity<List<Pelea>> getAllPeleas(){
        List<Pelea> peleas = peleaService.findAllPeleas();
        return new ResponseEntity<>(peleas, HttpStatus.OK);
    }

    @GetMapping("/findpelea/{id}")
    public ResponseEntity<Pelea> getPeleaById(@PathVariable("id") Long id){
        Pelea pelea = peleaService.findPeleaById(id);
        return new ResponseEntity<>(pelea, HttpStatus.OK);
    }

    @PostMapping("/addpelea")
    public ResponseEntity<Pelea> addPelea(@RequestBody Pelea pelea){
        Pelea newPelea = peleaService.addPelea((pelea));
        return new ResponseEntity<>(newPelea, HttpStatus.CREATED);
    }

    @PutMapping("/updatepelea")
    public ResponseEntity<Pelea> updatePelea(@RequestBody Pelea pelea){
        Pelea updatePelea = peleaService.updatePelea((pelea));
        return new ResponseEntity<>(updatePelea, HttpStatus.OK);
    }

    @DeleteMapping("/deletepelea/{id}")
    public ResponseEntity<?> deletePelea(@PathVariable("id") Long id){
        peleaService.deletePelea((id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
