package ru.gb.oseminar.data;

import java.time.LocalDate;

public abstract class  User {
    // Данный класс реализован по принципу Single Responsibility Principle
    // Имеет в себе только данные о едином участнике именумом User и не реализует ни каких отдельных функционалов.
    // Функционал переопределния Equals вынесен из класса для реализации по принципу SRP.
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", secondName='" + secondName + '\'' +
               ", patronymic='" + patronymic + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }


}
