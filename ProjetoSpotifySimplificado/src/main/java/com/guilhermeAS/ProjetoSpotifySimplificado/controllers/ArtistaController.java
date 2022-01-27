package com.guilhermeAS.ProjetoSpotifySimplificado.controllers;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artista")
public class ArtistaController { // CRUD = CREAT - READ - UPDATE - DELETE
    //modificar integer para long
    @Autowired
    private ArtistaService artistaService;

    Integer id = 0;

    @PostMapping
    public ResponseEntity<ArtistaGrupo> criar(@RequestBody ArtistaGrupo nome) {
        ArtistaGrupo artistaCriado =  artistaService.criar(nome);

        return ResponseEntity.created(null).body(artistaCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ArtistaGrupo> atualizar(@RequestBody ArtistaGrupo nome, @PathVariable Integer id) {
        ArtistaGrupo artistaAtualizado = artistaService.atualizar(nome, id);

        return ResponseEntity.ok(artistaAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id) {
       artistaService.deletar(id);

        // "Deletou o artista com ID " + id
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ArtistaGrupo>> listar() {
        List<ArtistaGrupo> listarArtistas = artistaService.listar();

        return ResponseEntity.ok(listarArtistas);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<ArtistaGrupo> escolher(@PathVariable Integer id) {
        ArtistaGrupo escolherArtista = artistaService.escolher(id);

        return ResponseEntity.ok(escolherArtista);
    }

}
