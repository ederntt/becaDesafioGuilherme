package com.guilhermeAS.ProjetoSpotifySimplificado.dtos;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Musica;
import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;

import java.util.List;
import java.util.stream.Collectors;

public class PlaylistDTO {
    private String nomePlaylist;
    private  List<Musica> musica;

    public PlaylistDTO(){}

    public PlaylistDTO(String nomePlaylist, List<Musica> musica) {
        this.nomePlaylist = nomePlaylist;
        this.musica = musica;
    }

    public PlaylistDTO(Playlist playlist) {
        this.nomePlaylist = playlist.getNome();
        this.musica = playlist.getMusica();
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }

    public static List<PlaylistDTO> converter(List<Playlist> playlists){
        return playlists.stream().map(PlaylistDTO::new).collect(Collectors.toList());
    }
}
