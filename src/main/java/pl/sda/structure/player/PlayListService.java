package pl.sda.structure.player;

import pl.sda.structure.player.model.Playlist;
import pl.sda.structure.player.model.Song;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PlayListService {

    //PlayListy użytkownika
    private final List<Playlist> userPlayList;

    public PlayListService() {
        //TODO Wybierz odpowiednią kolekcje
        this.userPlayList = null;
    }

    public void createPlayList(Playlist playlist, List<Song> songs) {
        //TODO
    }

    public Playlist getPlayList(String playListName) {
        //TODO
        return null;
    }

    public List<Song> getAllSongs() {
        //TODO
        return null;
    }

    public void addSongToPlayList(Song song, String playListName) {
        //TODO
    }

    public Optional<Playlist> getCurrentPlayedPlaylist() {
        //TODO
        return Optional.empty();
    }

    public Optional<Song> getCurrentPlayedSong() {
        //TODO
        return Optional.empty();
    }

    // Metody odpowiedzialne za obsługę odtwarzacza
    public void play(Long songId) {
        //TODO
    }

    public void pause(Long songId) {
        //TODO
    }

    public void stop(Long songId) {
        //TODO
    }

}
