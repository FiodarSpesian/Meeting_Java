package Examples.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;

public class task_3 {

    /*
    Создать список типа ArrayList. 
    Поместить в него как строки, так и целые числа. 
    Пройти по списку, найти и удалить целые числа.
     */
    public static void main(String[] args) {
        ArrayList MyList = new ArrayList<>(Arrays.asList(1, "9", "text", 5, 5, "anouther text", 25, 23.25));
        for (int i = 0; i < MyList.size(); i++) {
            if(MyList.get(i) instanceof Integer){
                MyList.remove(MyList.get(i--));
            }
        }
        System.out.println(MyList);
    }
}
