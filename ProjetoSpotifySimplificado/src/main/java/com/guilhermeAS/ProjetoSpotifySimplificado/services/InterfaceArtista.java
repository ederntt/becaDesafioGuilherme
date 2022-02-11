package com.guilhermeAS.ProjetoSpotifySimplificado.services;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;

import java.util.List;

public interface InterfaceArtista {

    Artista criar(Artista nome);

    Artista atualizar(Artista nome, Long id);//

    void deletar(Long id);//

    List<Artista> listar();//

    Artista escolher(Long id);//
}
