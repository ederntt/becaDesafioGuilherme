package com.guilhermeAS.ProjetoSpotifySimplificado.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlaylist;
    private String nome;

    @OneToMany
    private List<Musica> musica;

}
