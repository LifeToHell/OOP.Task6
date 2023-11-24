package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    // Пример реализации принципа Interface segregation principle. Реализует в себе единственный медот который далее
    // используется в классе Controller и реализует необходимые задачи. 
    void sendOnConsole(List<T> list);
}
