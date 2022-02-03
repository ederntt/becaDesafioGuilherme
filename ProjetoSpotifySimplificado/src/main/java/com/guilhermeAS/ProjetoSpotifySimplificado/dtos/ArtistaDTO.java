package com.guilhermeAS.ProjetoSpotifySimplificado.dtos;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;

import java.util.List;
import java.util.stream.Collectors;

public class ArtistaDTO {

    private String nomeArtista;

    public ArtistaDTO() {
    }

    public ArtistaDTO(String nomeArtista, Integer idArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArtistaDTO(Artista artista) {
        this.nomeArtista = artista.getNome();
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }


    public static List<ArtistaDTO> convert(List<Artista> artista){
        return artista.stream().map(ArtistaDTO::new).collect(Collectors.toList());
    }
}
