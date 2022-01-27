package com.guilhermeAS.ProjetoSpotifySimplificado.services;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;

import java.util.List;

public interface InterfaceArtista {

    ArtistaGrupo criar(ArtistaGrupo nome);

    ArtistaGrupo atualizar(ArtistaGrupo nome, Integer id);

    void deletar(Integer id);

    List<ArtistaGrupo> listar();

    ArtistaGrupo escolher(Integer id);


}
