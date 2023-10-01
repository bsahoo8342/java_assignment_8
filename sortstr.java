import java.util.*;

class sortstr {
    public static String arrange(String str) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String st = sc.nextLine();
        String sort = arrange(st);
        System.out.println("Sorted sequence character is: " + sort);
        sc.close();

    }
}
