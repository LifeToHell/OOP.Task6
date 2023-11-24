package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    //реализация принципа Interface segregation principle обращается к абстрактному классу первого уровня иерархии и передает данные для реализации
    // Student Conroller.
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
