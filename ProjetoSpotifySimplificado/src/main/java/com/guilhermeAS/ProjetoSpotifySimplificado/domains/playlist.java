package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

public class playlist {
    private String nomePlaylist;
    private album musica;
    private Integer numeroFaixa;

    public playlist() {
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public album getMusica() {
        return musica;
    }

    public void setMusica(album musica) {
        this.musica = musica;
    }

    public Integer getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(Integer numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }
}
