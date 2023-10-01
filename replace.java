import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = ab.nextLine();

        System.out.print("Old Character: ");
        String od = ab.nextLine();

        System.out.print("New Charcter to replace:");
        String nw = ab.nextLine();

        System.out.println("New string after replacement: " + (str.replace(od, nw)));
        ab.close();

    }
}
