package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import javax.persistence.*;

@Entity
public class Coletania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeColetania;
    @OneToOne
    private ArtistaGrupo artistaNome;
    @OneToOne
    private Album nomeAlmbum;

    public Coletania(){

    }

    public String getNomeColetania() {
        return nomeColetania;
    }

    public void setNomeColetania(String nomeColetania) {
        this.nomeColetania = nomeColetania;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtistaGrupo getArtistaNome() {
        return artistaNome;
    }

    public void setArtistaNome(ArtistaGrupo artistaNome) {
        this.artistaNome = artistaNome;
    }

    public Album getNomeAlmbum() {
        return nomeAlmbum;
    }

    public void setNomeAlmbum(Album nomeAlmbum) {
        this.nomeAlmbum = nomeAlmbum;
    }


}
