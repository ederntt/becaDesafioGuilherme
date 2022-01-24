package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

public class Playlist {
    private Long idPlaylist;
    private String nomePlaylist;

    public Long getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Long idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public Playlist() {
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }


}
