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
        
        // вариант 1
    
        ArrayList MyList = new ArrayList<>(Arrays.asList(1, "9", "text", 5, 5, "anouther text", 25, 23.25));
        for (int i = 0; i < MyList.size(); i++) {
            if(MyList.get(i) instanceof Integer){
                MyList.remove(MyList.get(i--));
            }
        }
        System.out.println(MyList);

        // вариант 2

        ArrayList<Object> list = new ArrayList<>(Arrays.asList("qwer", 23, "dfg", 21, 6, "asd", 45));
        for (int i = list.size() - 1; i >= 0; i--) {
            if ((list.get(i)) instanceof Integer) {
                list.remove (i);
            }
        }
        System.out.println(list);
    }
}
