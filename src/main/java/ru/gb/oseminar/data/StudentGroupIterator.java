package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
// Класс реализует в себе принцип LSP переопределяя метод Iterator для класса Student, но не меняя её исходную версию
// и имеет взаимозаменяемость. Не совсем понятна реализация принципа в данном примере кода, где и как его можно использовать,
// не изменяя при этом значительную часть функционала (реинжиниринг).
  private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
