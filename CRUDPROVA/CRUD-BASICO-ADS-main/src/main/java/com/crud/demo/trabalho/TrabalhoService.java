package com.crud.demo.trabalho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
     private TrabalhoRepository bookRepository;


    public List<TrabalhoModel> findAll(){
        return  trabalhoRepository.findAll();
    }

    public TrabalhoModel criarTrabalho(TrabalhoModel trabalhoModel){
        return trabalhoRepository.save(trabalhoModel);
    }

    public void deletarTrabalho(Long id){
        trabalhoRepository.deleteById(id);
    }

    public TrabalhoModel update(Long id, TrabalhoModel trabalhoMode){
       TrabalhoModel newtrabalho =  trabalhoRepository.findById(id).get();
       newtrabalho.setCategoria(trabalhoMode.getCategoria());
       newtrabalho.setNome(trabalhoMode.getNome());
       return trabalhoRepository.save(newtrabalho);

    }

    public void deletarTrabalho(Long id) {
    }
}
