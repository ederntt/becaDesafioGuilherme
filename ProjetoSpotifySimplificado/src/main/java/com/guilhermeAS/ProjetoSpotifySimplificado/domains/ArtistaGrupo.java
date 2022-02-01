package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import javax.persistence.*;

@Entity
public class ArtistaGrupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToOne
    private Coletania coletania;

    public Coletania getColetania() {
        return coletania;
    }

    public void setColetania(Coletania coletania) {
        this.coletania = coletania;
    }

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
