package pl.sda.structure.player.exception;

public class PlayListNotFoundException extends RuntimeException {

    public static final String PLAYLIST_NOT_FOUND_EXCEPTION_MESSAGE = "Nie odnaleziono podanej playlisty";

    public PlayListNotFoundException() {
        super(PLAYLIST_NOT_FOUND_EXCEPTION_MESSAGE);
    }
}
