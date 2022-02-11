package com.guilhermeAS.ProjetoSpotifySimplificado.controllers;


import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import com.guilhermeAS.ProjetoSpotifySimplificado.dtos.PlaylistDTO;
import com.guilhermeAS.ProjetoSpotifySimplificado.exceptions.ErroObject;
import com.guilhermeAS.ProjetoSpotifySimplificado.exceptions.ExceptionHandle;
import com.guilhermeAS.ProjetoSpotifySimplificado.mappers.PlaylistMapper;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;
    @Autowired
    private PlaylistMapper mapperP;

    @PostMapping
    public ResponseEntity<Playlist> criarPlaylist(@RequestBody Playlist nomePlaylist) {
        Playlist playlistCriar = playlistService.criarPlaylist(nomePlaylist);

        return ResponseEntity.created(null).body(playlistCriar);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Playlist> atualizarPlaylist(@RequestBody Playlist nomePlaylist, @PathVariable Long id) {
        Playlist atualizarPlaylist = playlistService.atualizarPlaylist(nomePlaylist, id);

        return ResponseEntity.ok(atualizarPlaylist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> apagarPlaylsit(@PathVariable Long id) {
        playlistService.apagarPlaylsit(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<PlaylistDTO>> listar() {
        List<Playlist> listarPlaylist = playlistService.listar();

        return ResponseEntity.ok(mapperP.playlistToPlaylistDTO(listarPlaylist));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Playlist> selecionar(@PathVariable Long id) {
        Playlist selecionarPlaylist = playlistService.selecionar(id);

        return ResponseEntity.ok(selecionarPlaylist);
    }
}
