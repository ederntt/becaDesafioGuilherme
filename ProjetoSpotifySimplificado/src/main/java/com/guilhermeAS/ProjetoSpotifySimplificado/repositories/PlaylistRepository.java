package com.guilhermeAS.ProjetoSpotifySimplificado.repositories;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    Playlist findByNome(String nome);
}
