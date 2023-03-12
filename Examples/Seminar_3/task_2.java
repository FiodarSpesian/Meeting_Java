package Examples.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
 */
public class task_2 {
    public static void main(String[] args) {
        //вариант 1
        ArrayList<String> Planets = new ArrayList<> (Arrays.asList("Венера", "Земля", "Марс", "Юпитер", "Марс", "Земля", "Земля"));
        Planets.sort(Comparator .naturalOrder ());
        int count = 1;
        String planet = Planets. get(0) ;
        for (int i = 1; i < Planets.size(); i++) {
            if (Planets.get(i).equals(planet)) {
                count++;
            } else {
                System.out.println(planet + " " + count);
                count = 1;
                planet = Planets.get(i);
            }
        }
        System.out.println(Planets.get(Planets.size()-1) + " " + count);

        //вариант 2
        for (int i = 0; i < Planets.size(); i++) {
            System.out.printf("%s %d\n", Planets.get(i), Collections.frequency(Planets, Planets.get(i)));
        }
    }
}
