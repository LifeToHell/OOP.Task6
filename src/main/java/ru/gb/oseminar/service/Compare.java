package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;
import java.util.Comparator;

public class Compare extends Teacher {
    public Compare(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
