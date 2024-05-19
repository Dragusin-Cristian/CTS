package Composite.FileSystemExample;

import java.time.temporal.IsoFields;
import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystemItem{
    List<IFileSystemItem> items = new ArrayList<>();
    String name;

    public Directory(String name){
        this.name = name;
    }


    @Override
    public void printName() {
        System.out.println(name);
        for (IFileSystemItem item : this.items){
            item.printName();
        }
    }

    public void addItem(IFileSystemItem item) {
        this.items.add(item);
    }

}
