package com.ase.seminar2.factory.explain;

interface Animal{
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

// Simple factory
class AnimalFactory {
    public static Animal createAnimal(String type){
        if("com.ase.seminar2.factory.explain.Dog".equalsIgnoreCase(type)){
            return new Dog();
        }
        if("com.ase.seminar2.factory.explain.Cat".equalsIgnoreCase(type)){
            return new Cat();
        }
        else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

// Client code
class MainEx1 {
    public static void main(String[] args){
        // Using the simple factory to create instances
        Animal dog = AnimalFactory.createAnimal("com.ase.seminar2.factory.explain.Dog");
        dog.sound();

        Animal cat = AnimalFactory.createAnimal("com.ase.seminar2.factory.explain.Cat");
        cat.sound();
    }
}