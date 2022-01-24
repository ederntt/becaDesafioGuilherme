package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

public class Coletania {
    private ArtistaGrupo nome;
    private Album nomeAlmbum;
    private Album numeroFaixa;

    public Coletania(){

    }

    public ArtistaGrupo getNome() {
        return nome;
    }

    public void setNome(ArtistaGrupo nome) {
        this.nome = nome;
    }

    public Album getNomeAlmbum() {
        return nomeAlmbum;
    }

    public void setNomeAlmbum(Album nomeAlmbum) {
        this.nomeAlmbum = nomeAlmbum;
    }

    public Album getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(Album numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }
}
