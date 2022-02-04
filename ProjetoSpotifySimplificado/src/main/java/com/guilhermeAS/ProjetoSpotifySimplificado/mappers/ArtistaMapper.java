package com.guilhermeAS.ProjetoSpotifySimplificado.mappers;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Artista;
import com.guilhermeAS.ProjetoSpotifySimplificado.dtos.ArtistaDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArtistaMapper {
    List<ArtistaDTO> artistaToArtistaDTO (List<Artista> artistas);

    ArtistaDTO artistaToArtistaDto(Artista artista);

    Artista artistaDtoToArtista(ArtistaDTO artistaDTO);

}
