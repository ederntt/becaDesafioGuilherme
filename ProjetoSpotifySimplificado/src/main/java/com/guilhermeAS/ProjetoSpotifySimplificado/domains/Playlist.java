package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlaylist;
    private String nome;

    @OneToMany
    private List<Musica> musica;

//    public Long getIdPlaylist() {
//        return idPlaylist;
//    }
//
//    public void setIdPlaylist(Long idPlaylist) {
//        this.idPlaylist = idPlaylist;
//    }
//
//    public Playlist() {
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public List<Musica> getMusica() {
//        return musica;
//    }
//
//    public void setMusica(List<Musica> musica) {
//        this.musica = musica;
//    }
}
