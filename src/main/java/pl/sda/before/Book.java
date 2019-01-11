package pl.sda.before;

/**
 * Przypomienie z zakresu Java Podstawy
 */
public class Book {

    private static double discount = 0.26; //zmianna klasowa

    private String author; //Zmiana instancyjna
    private String title; //zmianna instacyjna

    //Metoda instacyjna
    public String getAuthor() {
        //Zauważ że mamy tutaj dostępu do obiektu this
        return author;
    }

    //Metoda klasowa
    public static int getSomeNumber() {
        //Zauważ że nie mamy tutaj dostępu do obiektu this
        return 6;
    }

    public static void main(String[] args) {

        Book concept = new Book();
        // Żeby wykorzystywać metody instacyjne musimy działać na obiekcie
        String author = concept.getAuthor();

        // Do wykorzystywania metod klasowych nie potrzebujemy instancji obiektu
        int someNumber = Book.getSomeNumber();

    }


}
