import java.util.Scanner;

class Unicode {
    public void Unicode(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int value = (int) ch;
            System.out.println(ch + " Unicode values of characters are:" + value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String val = sc.nextLine();
        Unicode obj = new Unicode();
        obj.Unicode(val);
        sc.close();
    }
}