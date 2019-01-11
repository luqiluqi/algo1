package pl.sda.structure.player.model;

import java.util.List;
import java.util.Objects;

public class Playlist {

    private List<Song> songs;
    private String playListName;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(songs, playlist.songs) &&
                Objects.equals(playListName, playlist.playListName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songs, playListName);
    }
}
