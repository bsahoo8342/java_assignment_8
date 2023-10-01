import java.util.Scanner;

class Shortnm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full Name:");
        String fnm = sc.nextLine();

        String[] nm = fnm.split(" ");
        String snm = nm[0].substring(0, 1);
        String snm2 = nm[1].substring(0, 1);

        System.out.println("Short Name is " + snm + " " + snm2);
    }
}
