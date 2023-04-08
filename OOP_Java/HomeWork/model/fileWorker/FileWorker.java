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

public class FileWorker implements Writable, Readable, Serializable{
    private Tree arr;
    private String str;
    
    public FileWorker(Tree arr, String str) {
        this.arr = arr;
        this.str = str;
    }
    public Tree getHumanList(){
        return this.arr;
    }
    public String getFilePath() {
        return this.str;
    }
    
    @Override
    public void save() throws IOException {
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(str));
        try {
            outStream.writeObject((Object)arr);
        } catch (IOException e) {
            System.out.println("error.");
        }finally{
            outStream.close();
        }
    }
    @Override
    public List<Human> read() throws FileNotFoundException, IOException {
        List<Human> newHumanList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(str))) {
            try {
                newHumanList = (List<Human>) inputStream.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println("error.");
            }
        }
        return newHumanList;
    }
}
