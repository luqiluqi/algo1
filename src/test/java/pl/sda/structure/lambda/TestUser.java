package pl.sda.structure.lambda;

import java.time.LocalDate;
import java.util.Objects;

public class TestUser {

    //Czy użytkownik jest to manager.
    private boolean manager;
    // Imię użytkownika
    private String name;
    // Nazwisko użytkownika
    private String surname;
    // wiek użytkownika
    private int age;
    // data urodzenia użytkownika
    private LocalDate dayOfBirdth;

    //Getter i setter:

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDayOfBirdth() {
        return dayOfBirdth;
    }

    public void setDayOfBirdth(LocalDate dayOfBirdth) {
        this.dayOfBirdth = dayOfBirdth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestUser testUser = (TestUser) o;
        return manager == testUser.manager &&
                age == testUser.age &&
                Objects.equals(name, testUser.name) &&
                Objects.equals(surname, testUser.surname) &&
                Objects.equals(dayOfBirdth, testUser.dayOfBirdth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manager, name, surname, age, dayOfBirdth);
    }
}
