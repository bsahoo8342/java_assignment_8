import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n = ab.nextInt();

        String[] str = new String[n];
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count++;
            System.out.print("Enter " + count + " strings:");
            str[i] = ab.next();
        }
        Arrays.sort(str);
        System.out.println("Sorted strings are: " + Arrays.toString(str));
        ab.close();
    }
}
