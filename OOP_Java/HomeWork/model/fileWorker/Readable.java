package OOP_Java.HomeWork.model.fileWorker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import OOP_Java.HomeWork.model.human.Human;

public interface Readable<T extends Human> {
    public List<T> read() throws FileNotFoundException, IOException, ClassNotFoundException;
}
