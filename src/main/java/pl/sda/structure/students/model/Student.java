package pl.sda.structure.students.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Student {

    // średnia z przedmiotów
    private BigDecimal average;

    // wynik osiągniety z egazaminu końcowego - liczba punktów
    private int score;

    //Imię ucznia
    private String name;

    //Rok studiów [1, 2 , 3, 4, 5]
    private YearOfStudy yearOfStudy;

    // Typ studiów - inż / licencjat/ magister
    private StudyType studyType;

    //Rok urodzenia w formacie yyyy-MM-dd
    private LocalDate birdthDay;

    public Student(BigDecimal average, int score, String name, YearOfStudy yearOfStudy, StudyType studyType, LocalDate birdthDay) {
        this.average = average;
        this.score = score;
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.studyType = studyType;
        this.birdthDay = birdthDay;
    }
}
