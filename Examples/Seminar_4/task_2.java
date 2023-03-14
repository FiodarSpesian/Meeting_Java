package Examples.Seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        LinkedList<String> ll=new LinkedList<>();
        System.out.println("Enter value; if print value (print~<index>); if STOP prog (stop): ");
        while(true){
            String n =iscan.nextLine();
            if(n.equals("stop")){
                break;
            }
            else{
                if(n.contains("print~")){
                    ArrayList<String> str = new ArrayList(Arrays.asList(n.split("~")));
                    int a=Integer.parseInt(str.get(1));
                    System.out.println(ll.get(a));
                    ll.remove(a);            
                    }
                else{
                    ll.add(n);
                }
                System.out.println(ll);
            }
    
        }
    }
}

