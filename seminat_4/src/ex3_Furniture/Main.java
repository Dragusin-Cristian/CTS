package ex3_Furniture;

interface Chair {
    String sitOn();
}

class ModernChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a modern chair";
    }
}
class VictorianChair implements Chair {
    @Override
    public String sitOn() {
        return "Sitting on a victorian chair";
    }
}

interface Sofa {
    String lieOn();
}

class ModernSofa implements Sofa {
    @Override
    public String lieOn() {
        return "Sitting on a modern sofa";
    }
}
class VictorianSofa implements Sofa {
    @Override
    public String lieOn() {
        return "Sitting on a victorian sofa";
    }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements  FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements  FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class Client {
}


public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        Sofa modernSofa = modernFurnitureFactory.createSofa();

        FurnitureFactory victorianFurnitureFactory = new ModernFurnitureFactory();

    }
}
