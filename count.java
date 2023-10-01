import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name:");
        String str = sc.nextLine();

        int vol = 0, con = 0, dig = 0, sp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                vol++;
            }
            if (str.charAt(i) != 'a' || str.charAt(i) != 'A' ||
                    str.charAt(i) != 'e' || str.charAt(i) != 'E' ||
                    str.charAt(i) != 'i' || str.charAt(i) != 'I' ||
                    str.charAt(i) != 'o' || str.charAt(i) != 'O' ||
                    str.charAt(i) != 'u' || str.charAt(i) != 'U') {
                con++;
            }
            if (str.charAt(i) == '1' || str.charAt(i) == '2' ||
                    str.charAt(i) == '3' || str.charAt(i) == '4' ||
                    str.charAt(i) == '5' || str.charAt(i) == '6' ||
                    str.charAt(i) == '7' || str.charAt(i) == '8' ||
                    str.charAt(i) == '9' || str.charAt(i) == '0') {
                dig++;
            }
            if (str.charAt(i) == ' ') {
                sp++;
            }
        }
        System.out.println("Number of vowels: " + vol);
        System.out.println("Number of consonants: " + con);
        System.out.println("Number of digits: " + dig);
        System.out.println("Number of whitespaces: " + sp);
    }
}
