package com.guilhermeAS.ProjetoSpotifySimplificado.services;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;

import java.util.List;

public interface InterfaceArtista {

    Artista criar(Artista nome);

    Artista atualizar(Artista nome, Integer id);

    void deletar(Integer id);

    List<Artista> listar();//

    Artista escolher(Integer id);


}
