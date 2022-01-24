package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

public class ArtistaGrupo {

    private String nome;
    private Integer id;

    @Override
    public String toString() {
        return "nome = " + nome +
                ", id = " + id ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
