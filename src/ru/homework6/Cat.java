package ru.homework6;

public class Cat extends Animal{



    @Override
    void run (int runDistance) {
            System.out.println("Кошка пробежала " + runDistance + nameDistance);
    }
    @Override
    void swim (int swimDistance) {
        System.out.println("Кошка проплыла " + swimDistance + nameDistance);
    }

}
