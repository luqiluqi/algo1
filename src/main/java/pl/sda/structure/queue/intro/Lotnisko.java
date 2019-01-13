package pl.sda.structure.queue.intro;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Różnica pomiedzy poll() a remove() dla kolelki ?
 * <p>
 * offer() robi to samo co add()
 */
public class Lotnisko {

    public static void main(String[] args) {

        PriorityQueue<User> kolejka = new PriorityQueue<>(new KolejkaKomparator());

        kolejka.add(new User("Wojciech", false));
        kolejka.add(new User("Monika", true));
        kolejka.add(new User("Brajan", true));


    }


}
