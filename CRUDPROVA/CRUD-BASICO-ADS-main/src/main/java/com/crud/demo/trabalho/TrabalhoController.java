package com.crud.demo.trabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoService trabalhoService;


    @GetMapping
    private ResponseEntity<List<TrabalhoModel>> listarTrabalho(){
       List<TrabalhoModel> list = trabalhoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    private ResponseEntity<TrabalhoModel> criarTrabalho(@RequestBody TrabalhoDTO trabalhoDTO){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(trabalhoDTO.getId()).toUri();
        TrabalhoModel response = trabalhoService.criarLivro(trabalhoDTO.transformaParaObjeto());
        return ResponseEntity.created(uri).body(response);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletarTrabalho(@PathVariable Long id){
        trabalhoService.deletarTrabalho(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    private ResponseEntity<TrabalhoModel> update(@PathVariable Long id, @RequestBody TrabalhoModel trabalhoModel){
         TrabalhoModel response;
        response = trabalhoService.update(id, trabalhoModel);
        return ResponseEntity.ok().body(response);
    }

}
