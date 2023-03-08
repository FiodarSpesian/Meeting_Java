// Вывести все простые числа от 1 до 1000
package Seminar_1;

public class task_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[1000];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        sb.append("1 ");
        for (int k = 1; k < arr.length; k++) {
            int count = 0; 
            for (int j = 0; j < k; j++) { 
                if(arr[k] % arr[j] == 0){
                    count++;
                    
                }
            }
            if(count == 1) {
                sb.append(arr[k]);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
