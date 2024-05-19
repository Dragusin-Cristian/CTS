package Composite.FileSystemExample;

public class Main {
    public static void main(String[] args) {
        File item1 = new File("File 1");
        File item2 = new File("File 2");
        File item3 = new File("File 3");
        File item4 = new File("File 4");

        Directory branch1 = new Directory("Branch 1");
        Directory branch2 = new Directory("Branch 2");
        Directory branch3 = new Directory("Branch 3");

        branch1.addItem(item1);
        branch1.addItem(item2);

        branch2.addItem(item3);
        branch2.addItem(item4);

        branch3.addItem(branch1);
        branch3.addItem(branch2);

        branch3.printName();
    }
}
