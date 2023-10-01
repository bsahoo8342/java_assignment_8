import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = ab.nextLine();

        System.out.print("Enter string to insert: ");
        String od = ab.nextLine();

        System.out.print("Enter position:");
        int nw = ab.nextInt();
        StringBuffer ob = new StringBuffer(str);
        System.out.println("New string after insertion: " + (ob.insert(nw, od)));
        ab.close();

    }
}
