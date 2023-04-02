package OOP_Java.HomeWork.fileWorker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import OOP_Java.HomeWork.human.Human;

public interface Readable {
    public List<Human> read() throws FileNotFoundException, IOException;
}
