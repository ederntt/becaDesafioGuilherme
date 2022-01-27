package com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.InterfaceArtista;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService implements InterfaceArtista {

    Integer id = 0;

    public ArtistaGrupo criar(@NotNull ArtistaGrupo nome) {
        nome.setId(id++);

        return nome;
    }

    public ArtistaGrupo atualizar(@NotNull ArtistaGrupo nome, Integer id) {
        nome.setNome("POEHD");

        return nome;
    }

    public void deletar(Integer id) {
//
    }

    public List<ArtistaGrupo> listar() {
        ArtistaGrupo art1 = new ArtistaGrupo();
        art1.setId(1);
        art1.setNome("Los Hermanos");

        ArtistaGrupo art2 = new ArtistaGrupo();
        art2.setId(2);
        art2.setNome("Black Smoke Tigger");

        ArtistaGrupo art3 = new ArtistaGrupo();
        art3.setId(3);
        art3.setNome("Sorriso Maroto");

        return List.of(
                art1,
                art2,
                art3
        );
    }

    public ArtistaGrupo escolher( Integer id) {
        ArtistaGrupo art1 = new ArtistaGrupo();
        art1.setId(id);
        art1.setNome("Black Smoke Tigger");

        return art1;
    }

}
