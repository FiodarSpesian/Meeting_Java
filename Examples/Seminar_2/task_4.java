package Examples.Seminar_2;

import java.io.FileWriter;
import java.io.IOException;

public class task_4 {
    public static void main(String[] args) {
        String test = "TEST";
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            strB.append(test);
        }
    
    //  test = test.repeat(10);
        try (FileWriter fw = new FileWriter("Test2.txt", false)) {
            fw.write(strB.toString());
            fw.flush();
        } catch (IOException ex) {
            System.out.println("Exception.. :(");
        }
    }
}
