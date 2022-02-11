package com.guilhermeAS.ProjetoSpotifySimplificado.dtos;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Musica;
import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class PlaylistDTO {
    private String nome;
    private  List<Musica> musica;

    public PlaylistDTO(Playlist playlist) {
        this.nome = playlist.getNome();
        this.musica = playlist.getMusica();
    }

}
