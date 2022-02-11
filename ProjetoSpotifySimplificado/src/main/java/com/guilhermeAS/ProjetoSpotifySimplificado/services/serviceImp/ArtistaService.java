package com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;
import com.guilhermeAS.ProjetoSpotifySimplificado.exceptions.ExceptionHandle;
import com.guilhermeAS.ProjetoSpotifySimplificado.mappers.ArtistaMapper;
import com.guilhermeAS.ProjetoSpotifySimplificado.repositories.ArtistaRepository;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.InterfaceArtista;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArtistaService implements InterfaceArtista {

    private final ArtistaRepository artistaRepository;

    private final ArtistaMapper artistaMapper;

    @Override
    public Artista criar(@NotBlank Artista nomeArtista) {

        return artistaRepository.save(nomeArtista);
    }

    @Override
    public Artista atualizar(@NotNull Artista nomeArtista, Long id) {
        Artista modificar = this.escolher(id);
        modificar.setNome(nomeArtista.getNome());

        artistaRepository.save(modificar);

        return modificar;
    }

    @Override
    public void deletar(Long id) {
        artistaRepository.deleteById(id);
    }

    @Override
    public List<Artista> listar() {

       // List<ArtistaGrupo> listaArtistas =
        return artistaRepository.findAll();
               // listaArtistas ;
    }

    @Override
    public Artista escolher(Long id) {
        Optional<Artista> obter = artistaRepository.findById(id);

        if (obter.isPresent()){
            return obter.get();
        }

        throw new RuntimeException("O artista de ID " + id + " Não existe na base de dados!! ");
    }

}
