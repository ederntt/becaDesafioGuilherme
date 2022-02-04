package com.guilhermeAS.ProjetoSpotifySimplificado.mappers;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import com.guilhermeAS.ProjetoSpotifySimplificado.dtos.PlaylistDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PlaylistMapper {
    List<PlaylistDTO> playlistToPlaylistDTO (List<Playlist> playlists);

    PlaylistDTO playlistToPlaylistDTO(Playlist playlist);

    Playlist playlistToPlaylistDTO (PlaylistDTO playlistDTO);
}
