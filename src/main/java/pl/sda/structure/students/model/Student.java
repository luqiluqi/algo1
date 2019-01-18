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

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public StudyType getStudyType() {
        return studyType;
    }

    public void setStudyType(StudyType studyType) {
        this.studyType = studyType;
    }

    public LocalDate getBirdthDay() {
        return birdthDay;
    }

    public void setBirdthDay(LocalDate birdthDay) {
        this.birdthDay = birdthDay;
    }
}
