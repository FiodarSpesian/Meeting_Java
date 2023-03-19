package Examples.Seminar_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class task_1 {
    /*
    1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
    2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
    3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
     */
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(mySet);
        LinkedHashSet<Integer> myLinkedSet = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(myLinkedSet);
        TreeSet<Integer> myTreeSet = new TreeSet<>(Comparator.reverseOrder());
        TreeSet<Integer> myTreeSet1 = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        myTreeSet.addAll(myTreeSet1);
        System.out.println(myTreeSet);
    }
}
