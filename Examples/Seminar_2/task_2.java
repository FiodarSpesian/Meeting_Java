package Examples.Seminar_2;

public class task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcaaadda";
        System.out.println(rle(str));
    }

    public static String rle(String str) {
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    newStr.append(str.charAt(i));
                } else
                    newStr.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        if (count == 1) {
            newStr.append(str.charAt(str.length() - 1));
        } else {
            newStr.append(str.charAt(str.length() - 1)).append(count);
        }
        return newStr.toString();
    }
    
}
