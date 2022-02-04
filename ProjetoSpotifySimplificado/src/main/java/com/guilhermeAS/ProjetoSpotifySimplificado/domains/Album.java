package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeAlbum;
    private String musica;

    @OneToOne
    private Artista idArtista;

//    public Artista getIdArtista() {
//        return idArtista;
//    }
//
//    public Album(){
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNomeAlbum() {
//        return nomeAlbum;
//    }
//
//    public void setNomeAlbum(String nomeAlbum) {
//        this.nomeAlbum = nomeAlbum;
//    }
//
//    public String getMusica() {
//        return musica;
//    }
//
//    public void setMusica(String musica) {
//        this.musica = musica;
//    }

}
