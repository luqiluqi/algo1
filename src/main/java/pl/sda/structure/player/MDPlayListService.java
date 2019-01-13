package pl.sda.structure.player;

import pl.sda.structure.player.exception.PlayListNotFoundException;
import pl.sda.structure.player.model.Playlist;
import pl.sda.structure.player.model.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MDPlayListService {

    //PlayListy użytkownika
    private final List<Playlist> userPlayList;

    public MDPlayListService() {
        this.userPlayList = new LinkedList<>();
    }

    public void createPlayList(Playlist playlist, List<Song> songs) {
        playlist.setSongs(songs);
        userPlayList.add(playlist);
    }

    public Playlist getPlayList(String playListName) {

        for (Playlist playlist : userPlayList) {

            if (playlist.getPlayListName().equals(playListName)) {
                return playlist;
            }
        }
        throw new PlayListNotFoundException();
    }

    public List<Song> getAllSongs() {
        List<Song> result = new ArrayList<>();

        for (Playlist playlist : userPlayList) {
            result.addAll(playlist.getSongs());
        }

        return result;
    }

    public void addSongToPlayList(Song song, String playListName) {
        Playlist playList = getPlayList(playListName);
        playList.getSongs().add(song);
    }

    public Optional<Playlist> getCurrentPlayedPlaylist() {

        for (Playlist playlist : userPlayList) {

            for (Song song : playlist.getSongs()) {
                if (song.isPlayed()) {
                    return Optional.of(playlist);
                }
            }

        }

        return Optional.empty();
    }

    public Optional<Song> getCurrentPlayedSong() {

        for (Playlist playlist : userPlayList) {

            for (Song song : playlist.getSongs()) {
                if (song.isPlayed()) {
                    return Optional.of(song);
                }
            }

        }
        return Optional.empty();
    }

    // Metody odpowiedzialne za obsługę odtwarzacza
    public void play(Long songId) {

        for(Playlist playlist : userPlayList){

            for(Song song : playlist.getSongs()){
                if(song.getId().equals(songId)){
                    song.setPlayed(true);
                }else{
                    song.setPlayed(false);
                }

            }

        }

    }

    public void pause(Long songId) {

        for(Playlist playlist : userPlayList){


            for(Song song : playlist.getSongs()){

                if(song.getId().equals(songId)){
                    song.setPlayed(!song.isPlayed());
                }

            }

        }

    }

    public void stop(Long songId) {

        for(Playlist playlist : userPlayList){

            for(Song song : playlist.getSongs()){

                if(song.getId().equals(songId)){
                    song.setPlayed(false);
                }

            }

        }

    }

}
