package com.ase.seminar2.singleton;

class Singleton {
    private static  Singleton instance;

    private Singleton () {

    }

    public static Singleton getIntstance (){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething () {System.out.println("com.ase.seminar2.singleton.Singleton is doing something.");}
}

class MainEx1 {
    public static void main (String[] args){
    Singleton singletonInstance = Singleton.getIntstance();

    singletonInstance.doSomething();
    }
}
