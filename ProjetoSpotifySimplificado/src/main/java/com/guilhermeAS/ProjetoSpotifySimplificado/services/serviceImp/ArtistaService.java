package com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;
import com.guilhermeAS.ProjetoSpotifySimplificado.repositories.ArtistaRepository;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.InterfaceArtista;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService implements InterfaceArtista {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public Artista criar(@NotNull Artista nomeArtista) {
        Artista artistaSalvo = artistaRepository.save(nomeArtista);

        return artistaSalvo;
    }

    @Override
    public Artista atualizar(@NotNull Artista nomeArtista, Integer id) {
        Artista modificar = this.escolher(id);
        modificar.setNome(nomeArtista.getNome());

        artistaRepository.save(modificar);

        return modificar;
    }

    @Override
    public void deletar(Integer id) {
        artistaRepository.deleteById(id);
    }

    @Override
    public List<Artista> listar() {

       // List<ArtistaGrupo> listaArtistas =
        return artistaRepository.findAll();
               // listaArtistas ;
    }

    @Override
    public Artista escolher(Integer id) {
        Optional<Artista> obter = artistaRepository.findById(id);

        if (obter.isPresent()){
            return obter.get();
        }

            throw new RuntimeException("Artista não encontado! ");
    }

}
