package com.guilhermeAS.ProjetoSpotifySimplificado.controllers;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;
import com.guilhermeAS.ProjetoSpotifySimplificado.dtos.ArtistaDTO;
import com.guilhermeAS.ProjetoSpotifySimplificado.mappers.ArtistaMapper;
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
    @Autowired
    private ArtistaMapper mapper;


    @PostMapping
    public ResponseEntity<Artista> criar(@RequestBody Artista nome) {
        Artista artistaCriado =  artistaService.criar(nome);

        return ResponseEntity.created(null).body(artistaCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Artista> atualizar(@RequestBody Artista nome, @PathVariable Integer id) {
        Artista artistaAtualizado = artistaService.atualizar(nome, id);

        return ResponseEntity.ok(artistaAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id) {
       artistaService.deletar(id);

        // "Deletou o artista com ID " + id
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ArtistaDTO>> listar() {
        List<Artista> listarArtistas = artistaService.listar();

       return ResponseEntity.ok(mapper.artistaToArtistaDTO(listarArtistas));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> escolher(@PathVariable Integer id) {
        Artista escolherArtista = artistaService.escolher(id);

        return ResponseEntity.ok(escolherArtista);
    }

}
