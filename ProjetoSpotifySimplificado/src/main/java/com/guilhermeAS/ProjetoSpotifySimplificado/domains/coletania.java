package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

public class coletania {
    private artistaGrupo nome;
    private album nomeAlmbum;
    private album numeroFaixa;

    public coletania(){

    }

    public artistaGrupo getNome() {
        return nome;
    }

    public void setNome(artistaGrupo nome) {
        this.nome = nome;
    }

    public album getNomeAlmbum() {
        return nomeAlmbum;
    }

    public void setNomeAlmbum(album nomeAlmbum) {
        this.nomeAlmbum = nomeAlmbum;
    }

    public album getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(album numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }
}
