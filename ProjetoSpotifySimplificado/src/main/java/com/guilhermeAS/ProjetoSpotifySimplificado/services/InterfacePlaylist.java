package com.guilhermeAS.ProjetoSpotifySimplificado.services;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;

import java.util.List;

public interface InterfacePlaylist {

    Playlist criarPlaylist(Playlist nomePlaylist);

    Playlist atualizarPlaylist(Playlist nomePlaylist, Long id);

    void apagarPlaylsit(Long id);

    List<Playlist> listar();

    Playlist selecionar(Long id);

}
