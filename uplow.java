import java.util.Scanner;

public class uplow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name:");
        String str=sc.nextLine();
        System.out.println("Name in Upper Case: "+str.toUpperCase());
        System.out.println("Name in Lower Case: "+str.toLowerCase());
    }
}
