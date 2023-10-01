
import java.util.Scanner;

public class Snm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String fullName = scanner.nextLine();

        String shortName = convertToShortName(fullName);
        System.out.println("Short name: " + shortName);
        scanner.close();
    }

    public static String convertToShortName(String fullName) {
        StringBuilder shortName = new StringBuilder();

        String[] names = fullName.split(" ");
        for (String name : names) {
            shortName.append(name.charAt(0));
        }

        return shortName.toString().toUpperCase();
    }
}
