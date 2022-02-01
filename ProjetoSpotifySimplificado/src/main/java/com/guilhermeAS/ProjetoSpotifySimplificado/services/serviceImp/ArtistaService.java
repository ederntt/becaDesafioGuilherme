package com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
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
    public ArtistaGrupo criar(@NotNull ArtistaGrupo nomeArtista) {
        ArtistaGrupo artistaSalvo = artistaRepository.save(nomeArtista);

        return artistaSalvo;
    }

    @Override
    public ArtistaGrupo atualizar(@NotNull ArtistaGrupo nomeArtista, Integer id) {
        ArtistaGrupo modificar = this.escolher(id);
        modificar.setNome(nomeArtista.getNome());

        artistaRepository.save(modificar);

        return modificar;
    }

    @Override
    public void deletar(Integer id) {
        artistaRepository.deleteById(id);
    }

    @Override
    public List<ArtistaGrupo> listar() {

       // List<ArtistaGrupo> listaArtistas =
        return artistaRepository.findAll();
               // listaArtistas ;
    }

    @Override
    public ArtistaGrupo escolher( Integer id) {
        Optional<ArtistaGrupo> obter = artistaRepository.findById(id);

        if (obter.isPresent()){
            return obter.get();
        }

            throw new RuntimeException("Artista não encontado! ");
    }

}
