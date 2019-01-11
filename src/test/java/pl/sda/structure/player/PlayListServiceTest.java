package pl.sda.structure.player;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.structure.player.model.Playlist;
import pl.sda.structure.player.model.Song;

import java.util.Arrays;

public class PlayListServiceTest {


    @Test
    public void testCreatePlayList1(){
        //Na początku mamy pustą playListę
        PlayListService service = new PlayListService();

        //Tworzymy playListę
        String playListName = "Moje ulubione piosenki";
        Playlist playlist = new Playlist();
        playlist.setPlayListName(playListName);

        //Tworzymy piosenkę
        Song song = new Song();
        song.setArtist("Dawid Podsiadło");
        song.setDuration("3:41");
        song.setId(1l);
        song.setPlayed(false);
        song.setTitle("Małomiasteczkowy");

        //Tworzymy playListe , początkowo z jedną piosenkę
        service.createPlayList(playlist, Arrays.asList(song));

        //Pytam serwis czy w kolekcji znaduję się nasza playlista
        Assert.assertEquals(playlist,service.getPlayList(playListName));
    }

    @Test
    public void testGetAllSongs(){
        //Na początku mamy pustą playListę
        PlayListService service = new PlayListService();

        //Tworzymy playListę
        String playListName = "Moje ulubione piosenki";
        Playlist playlist = new Playlist();
        playlist.setPlayListName(playListName);

        //Tworzymy piosenki
        Song s1 = new Song();
        s1.setArtist("Dawid Podsiadło");
        s1.setDuration("3:41");
        s1.setId(1l);
        s1.setPlayed(false);
        s1.setTitle("Małomiasteczkowy");

        //Tworzymy piosenki
        Song s2 = new Song();
        s2.setArtist("Akcent");
        s2.setDuration("2:41");
        s2.setId(2l);
        s2.setPlayed(false);
        s2.setTitle("Przez twe oczy zielone");


        //Tworzymy playListe , początkowo z jedną piosenkę
        service.createPlayList(playlist, Arrays.asList(s1,s2));

        //Pytam o liczbę aktualnie przechowywanych piosenek na playliscie - spodziewamy się 2
        Assert.assertEquals(2,service.getAllSongs().size());

    }


}