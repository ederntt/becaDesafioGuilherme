package com.guilhermeAS.ProjetoSpotifySimplificado.controllers;


import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    Long id = 0L;

    @PostMapping
    public ResponseEntity<Playlist> criarPlaylist(@RequestBody Playlist nomePlaylist) {
        nomePlaylist.getNomePlaylist();

        if (nomePlaylist.getNomePlaylist().length() <= 3) {
            return ResponseEntity.unprocessableEntity().build();
        }

        nomePlaylist.setIdPlaylist(id++);

        return ResponseEntity.created(null).body(nomePlaylist);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Playlist> atualizarPlaylist (@RequestBody Playlist nomePlaylist, @PathVariable Long id){
        nomePlaylist.setNomePlaylist("Favoritas");
        nomePlaylist.setIdPlaylist(id++);
        return ResponseEntity.ok(nomePlaylist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarPlaylsit(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Playlist>> listar(){
        Playlist pl1 = new Playlist();
        pl1.setIdPlaylist(id++);
        pl1.setNomePlaylist("As Favoritas");


        Playlist pl2 = new Playlist();
        pl2.setIdPlaylist(id++);
        pl2.setNomePlaylist("As mais tocadas");


        Playlist pl3 = new Playlist();
        pl3.setIdPlaylist(id++);
        pl3.setNomePlaylist("Moments :p");

        return ResponseEntity.ok(List.of(
                pl1,
                pl2,
                pl3
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Playlist> selecionar(@PathVariable Long id){
        Playlist pl1 = new Playlist();
        pl1.setIdPlaylist(id);
        pl1.setNomePlaylist("Codar");

        return ResponseEntity.ok(pl1);
    }
}