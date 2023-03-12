/*
Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит 
из чередующихся символов c1 и c2, начиная с c1.
 */

package Examples.Seminar_2;

public class task_1 {
    public static void main(String[] args) {
        int N = 6;
        String str1 = "a";
        String str2 = "b";
        print(N,str1,str2);

//        System.out.println("ab".repeat(3));
    }
    public static void print(int length, String str1, String str2){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length/2; i++) {
            stringBuilder.append(str1).append(str2);
        }
        System.out.println(stringBuilder.toString());
    }
}
