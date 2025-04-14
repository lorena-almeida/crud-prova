package com.crud.demo.trabalho;


public class TrabalhoDTO {

    private Long id;
    private String nome;
    private String categoria;


    public TrabalhoModel transformaParaObjeto(){
        return new TrabalhoModel(nome, categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
