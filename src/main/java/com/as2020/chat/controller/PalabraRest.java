package com.as2020.chat.controller;

import com.as2020.chat.Model.Ipalabras;
import com.as2020.chat.Model.Palabras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/palabra")
@RequestMapping("/palabra")

public class PalabraRest {
    @Autowired
    private Ipalabras repo;

    @GetMapping
    public List<Palabras> listar(){
        return repo.findAll();
    }
    @GetMapping(value = "/{id}")
    public String getIdsala(@PathVariable("id") String idsala) {
        return repo.getOne(idsala).getPalabra();
    }



    @PostMapping
    public void insertar(@RequestBody Palabras pal){
        repo.save(pal);
    }

    @PutMapping
    public void modificar(@RequestBody Palabras pal){
        repo.save(pal);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") String idsala) {
        repo.deleteById(idsala);
    }

}
