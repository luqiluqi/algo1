package pl.sda.structure.player.solution;

import pl.sda.structure.hostpital.model.Disease;
import pl.sda.structure.player.MDPlayListService;
import pl.sda.structure.player.model.Playlist;
import pl.sda.structure.player.model.Song;

import java.util.*;

public class MDPlayerRunner {

    private MDPlayListService service = new MDPlayListService();

    public void run() {

        final Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean demo = false;


        Playlist tempPlayList = new Playlist();
        tempPlayList.setPlayListName("rock");

        Song s1 = new Song();
        s1.setTitle("Nieznajomy");
        s1.setDuration("4:41");
        s1.setArtist("Dawid Podsiadło");
        Song s2 = new Song();
        s2.setTitle("Nie ma fal");
        s2.setDuration("1:41");
        s2.setArtist("Dawid Podsiadło");
        Song s3 = new Song();
        s3.setTitle("Przez twe oczy");
        s3.setDuration("14:51");
        s3.setArtist("Akcent");
        service.createPlayList(tempPlayList, Arrays.asList(s1,s2,s3));


        StringBuilder menuBuilder = new StringBuilder();
        menuBuilder.append("Menu:\n")
                .append("q - wyjście \n")
                .append("1.Wyświetl wszystkie piosenki\n")
                .append("2.Wyswietl playliste po nazwie?\n")
                .append("3.Utwórz playlistę\n")
                .append("4.Dodaj piosenkę do playlisty\n")
                .append("5.Pobierz nazwę playlisty którą użytkownika aktualnie słucha\n")
                .append("6.Pobierz tytuł playlisty którą użytkownik aktualnie słucha\n")
                .append("7. Odsłuchaj piosenkę\n")
                .append("8. Pause piosenkę\n")
                .append("9. Zatrzymaj piosenkę\n");


        while (!exit) {

            try {
                //Usypiamy wątek główny programu na 2 sekundy - prosta symulacja do wyświetlania
                // Płynnie wiadomości na liscie
                Thread.sleep(4000);

                //Wyświetl menu
                System.out.println(menuBuilder.toString());
                System.out.println();
                //Pobierz od użytkownika z linii poleceń zadanie do wykonania
                final String userInput = scanner.nextLine();

                switch (userInput) {
                    case "q":
                        exit = true;
                        System.out.println("Wychodzę");
                        break;
                    case "1":
                        List<Song> allSongs = service.getAllSongs();

                        if (allSongs.isEmpty()) {
                            System.out.println("W bazie nie ma aktualnie piosenek. Utwórz playlistę a następnie dodaj piosenki");
                        } else {
                            System.out.println("Dostępne piosenki:");
                            for (Song song : allSongs) {
                                System.out.println(song);
                            }
                            System.out.println();
                        }
                        break;
                    case "2":
                        System.out.println("Podaj nazwę playlisty: ");
                        String playListName = scanner.nextLine();
                        Playlist playList = service.getPlayList(playListName);
                        System.out.println(playList);
                        break;
                    case "3":
                        System.out.println("Podaj nazwę playlisty:");
                        String newPlayListName = scanner.nextLine();
                        Playlist playlist = new Playlist();
                        playlist.setPlayListName(newPlayListName);
                        service.createPlayList(playlist, new ArrayList<>());
                        System.out.println("Utworzono nową playlistę o nazwie: " + newPlayListName);
                        break;
                    case "4":

                        System.out.println("Podaj nazwę playlisty:");
                        String playListToAddNewSong = scanner.nextLine();

                        System.out.println("Podaj nazwę artysty: ");
                        String artysta = scanner.nextLine();

                        System.out.println("Podaj czas trwania[w formacie mm:ss]: ");
                        String duration = scanner.nextLine();

                        System.out.println("Podaj tytuł: ");
                        String title = scanner.nextLine();

                        Song newSong = new Song();
                        newSong.setArtist(artysta);
                        newSong.setDuration(duration);
                        newSong.setPlayed(false);
                        newSong.setTitle(title);

                        service.addSongToPlayList(newSong, playListToAddNewSong);
                        System.out.println(String.format("Dodano piosenkę %s do playlisty %s", newSong, playListToAddNewSong));
                        break;
                    case "5":

                        Optional<Playlist> currentPlayedPlaylist = service.getCurrentPlayedPlaylist();

                        if (currentPlayedPlaylist.isPresent()) {
                            System.out.println("Użytkownik aktualnie słucha playlisty: " + currentPlayedPlaylist.get().getPlayListName());
                        } else {
                            System.out.println("Aktualnie nie odtwarza żadnej");
                        }

                        break;
                    case "6":

                        Optional<Song> currentPlayedSong = service.getCurrentPlayedSong();

                        if (currentPlayedSong.isPresent()) {
                            System.out.println("Użytkownik aktualnie słucha : " + currentPlayedSong.get());
                        } else {
                            System.out.println("Aktualnie nie odtwarza żadnej piosenki");
                        }

                        break;
                    case "7":
                        List<Song> toPlaySong = service.getAllSongs();
                        if(toPlaySong.isEmpty()){
                            System.out.println("Brak piosenek!: ");
                            break;
                        }
                        System.out.println("Którą piosenkę odtworzyć[Podaj ID]: ");
                        toPlaySong.forEach(song -> System.out.println(song));
                        long toPlaySongId = Long.valueOf(scanner.nextLine());
                        System.out.println("Play...");
                        service.play(toPlaySongId);
                        break;
                    case "8":
                        List<Song> toPauseSongs = service.getAllSongs();
                        if(toPauseSongs.isEmpty()){
                            System.out.println("Brak piosenek!: ");
                            break;
                        }
                        System.out.println("Którą piosenkę zatrzymać[Podaj ID]: ");
                        toPauseSongs.forEach(song -> System.out.println(song));
                        System.out.println("Pause...");
                        long toPauseSong = Long.valueOf(scanner.nextLine());
                        service.pause(toPauseSong);
                        break;
                    case "9":
                        List<Song> toStopSongs = service.getAllSongs();
                        if(toStopSongs.isEmpty()){
                            System.out.println("Brak piosenek!: ");
                            break;
                        }
                        System.out.println("Którą piosenkę zatrzymać[Podaj ID]: ");
                        toStopSongs.forEach(song -> System.out.println(song));
                        long toStopSong = Long.valueOf(scanner.nextLine());
                        System.out.println("Zatrzymuję...");
                        service.pause(toStopSong);
                        break;
                    default:
                        System.out.println("Nie rozpoznano polecenia");
                }


            } catch (Exception ex) {
                System.err.println("Wystąpił błąd: " + ex.getMessage());
            }


        }
        System.out.println("Koniec pracy");
    }

}
