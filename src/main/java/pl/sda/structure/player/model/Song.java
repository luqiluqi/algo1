package pl.sda.structure.player.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Song {

    private Long id;
    private String title;
    private String duration;
    private String artist;
    private boolean isPlayed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return isPlayed == song.isPlayed &&
                Objects.equals(id, song.id) &&
                Objects.equals(title, song.title) &&
                Objects.equals(duration, song.duration) &&
                Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, duration, artist, isPlayed);
    }
}
