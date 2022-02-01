package com.guilhermeAS.ProjetoSpotifySimplificado.repositories;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.ArtistaGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ArtistaRepository extends JpaRepository<ArtistaGrupo, Integer> {
}
