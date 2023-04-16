package OOP_Java.HomeWork.model.fileWorker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import OOP_Java.HomeWork.model.human.Human;
import OOP_Java.HomeWork.model.tree.Tree;

public class FileWorker<T extends Human> implements Writable, Readable<T>, Serializable{
    private Tree<T> arr;
    private String path;
    
    public FileWorker(Tree<T> arr, String path) {
        this.arr = arr;
        this.path = path;
    }
    public Tree<T> getHumanList(){
        return this.arr;
    }
    public String getFilePath() {
        return this.path;
    }
    
    @Override
    public void save() throws IOException {
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(path));
        outStream.writeObject((Object)arr);        
        outStream.close();
        
    }
    @Override
    public List<T> read() throws FileNotFoundException, IOException, ClassNotFoundException {
        List<T> newHumanList = new ArrayList<>();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path));
        newHumanList = (List<T>) inputStream.readObject();
        inputStream.close();
        return newHumanList;
    }
}
