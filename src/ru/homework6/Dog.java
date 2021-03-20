package ru.homework6;

public class Dog extends Animal{

   @Override
   void run (int runDistance){
        System.out.println("Собака пробежала " + runDistance + nameDistance);
    }

    @Override
    void swim (int swimDistance){
        System.out.println("Собака проплыла " + swimDistance + nameDistance);
    }

}
