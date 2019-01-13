package pl.sda.structure.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String args[]){
        Set<String> zbior = new HashSet<>();
        zbior.add("ala");
        zbior.add("ma");
        zbior.add("kota");
        zbior.add("ala");

        int size = zbior.size();
        System.out.println(size);


        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person("Monika"));
        personSet.add(new Person("Ala"));
        personSet.add(new Person("Monika"));

        int size1 = personSet.size();
        System.out.println(size1);




    }


}
