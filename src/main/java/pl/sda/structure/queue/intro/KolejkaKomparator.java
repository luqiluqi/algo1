package pl.sda.structure.queue.intro;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Comparator;

public class KolejkaKomparator implements Comparator<User> {

    /**
     * @param o1
     * @param o2 skoro o1 jest premium > 0
     *           przeciwnym razie 0;
     * @return
     */
    @Override
    public int compare(User o1, User o2) {
        Boolean premium = o1.isPremium();
        Boolean premium1 = o2.isPremium();

        return premium.compareTo(premium1);

    }
}
