package com.guilhermeAS.ProjetoSpotifySimplificado.services.serviceImp;

import com.guilhermeAS.ProjetoSpotifySimplificado.domains.Playlist;
import com.guilhermeAS.ProjetoSpotifySimplificado.services.InterfacePlaylist;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService implements InterfacePlaylist {

    Long id = 0L;

    public Playlist criarPlaylist(Playlist nomePlaylist) {
        nomePlaylist.getNomePlaylist();

        nomePlaylist.setIdPlaylist(id++);

        return nomePlaylist;
    }

    public Playlist atualizarPlaylist (Playlist nomePlaylist, Long id){
        nomePlaylist.setNomePlaylist("Favoritas");
        nomePlaylist.setIdPlaylist(id++);
        return nomePlaylist;
    }

    public void apagarPlaylsit(Long id){
 //
    }

    public List<Playlist> listar(){
        Playlist pl1 = new Playlist();
        pl1.setIdPlaylist(id++);
        pl1.setNomePlaylist("As Favoritas");


        Playlist pl2 = new Playlist();
        pl2.setIdPlaylist(id++);
        pl2.setNomePlaylist("As mais tocadas");


        Playlist pl3 = new Playlist();
        pl3.setIdPlaylist(id++);
        pl3.setNomePlaylist("Moments :p");

        return List.of(
                pl1,
                pl2,
                pl3
        );
    }

    public Playlist selecionar(Long id){
        Playlist pl1 = new Playlist();
        pl1.setIdPlaylist(id);
        pl1.setNomePlaylist("Codar");

        return pl1;
    }

}
