package factory_method;

interface Animal {
    void breathe();
}

class Dog implements Animal{
    public void breathe(){
        System.out.println("Dog breathing");
    }
}

class Cat implements Animal {
    public void breathe(){
        System.out.println("Cat breathing");
    }
}

class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        }
        if("Cat".equalsIgnoreCase(type)){
            return new Cat();
        }
        throw new IllegalArgumentException("Please provide an existing animal");
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Animal dog = AnimalFactory.createAnimal("Dog");
        Animal cat = AnimalFactory.createAnimal("Cat");

        dog.breathe();
        cat.breathe();
    }
}
