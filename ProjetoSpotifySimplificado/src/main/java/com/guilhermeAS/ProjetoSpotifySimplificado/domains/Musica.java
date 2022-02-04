package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Musica {

    @Id
    private String nome;

    private Long numeroFaixa;


    @ManyToOne
    private Album idAlbum;



//    public Album getIdAlbum() {
//        return idAlbum;
//    }
//
//    public void setIdAlbum(Album idAlbum) {
//        this.idAlbum = idAlbum;
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
//    public Long getNumeroFaixa() {
//        return numeroFaixa;
//    }
//
//    public void setNumeroFaixa(Long numeroFaixa) {
//        this.numeroFaixa = numeroFaixa;
//    }
}
