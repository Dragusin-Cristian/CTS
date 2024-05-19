package Composite.FileSystemExample;

public class File implements IFileSystemItem{
    String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
