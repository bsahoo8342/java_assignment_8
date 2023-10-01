
import java.util.Scanner;

public class UnicodeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Unicode values of characters are: ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int unicodeValue = (int) c;
            System.out.print(unicodeValue + " ");
        }

        scanner.close();
    }
}