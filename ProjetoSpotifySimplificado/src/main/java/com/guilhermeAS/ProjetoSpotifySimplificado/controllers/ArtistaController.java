package com.guilhermeAS.ProjetoSpotifySimplificado.controllers;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artista")
public class ArtistaController { // CRUD = CREAT - READ - UPDATE - DELETE
    //modificar integer para long
    Integer id = 0;

    @PostMapping
    public ResponseEntity<ArtistaGrupo> criar(@RequestBody ArtistaGrupo nome) {
        System.out.println(nome);

        if (nome.getNome().length() <= 3) {
            return ResponseEntity.unprocessableEntity().build();
        }

        nome.setId(id++);

        return ResponseEntity.created(null).body(nome);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ArtistaGrupo> atualizar(@RequestBody ArtistaGrupo nome, @PathVariable Integer id) {
        nome.setNome("POEHD");

        return ResponseEntity.ok(nome);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id) {
        // "Deletou o artista com ID " + id
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ArtistaGrupo>> listar() {
        ArtistaGrupo art1 = new ArtistaGrupo();
        art1.setId(1);
        art1.setNome("Los Hermanos");

        ArtistaGrupo art2 = new ArtistaGrupo();
        art2.setId(2);
        art2.setNome("Black Smoke Tigger");

        ArtistaGrupo art3 = new ArtistaGrupo();
        art3.setId(3);
        art3.setNome("Sorriso Maroto");

        return ResponseEntity.ok(List.of(
                art1,
                art2,
                art3
        ));
    }

    @GetMapping("/{nome}")
    public ResponseEntity<ArtistaGrupo> escolher(@PathVariable Integer id) {
        ArtistaGrupo art1 = new ArtistaGrupo();
        art1.setId(id);
        art1.setNome("Black Smoke Tigger");

        return ResponseEntity.ok(art1);
    }

}
