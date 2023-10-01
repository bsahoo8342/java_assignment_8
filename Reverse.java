import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string:");
        String str=sc.nextLine();
        StringBuilder ob=new StringBuilder();
        ob.append(str);     //To convert String to StringBuilder
        ob.reverse();
        System.out.println("Reverse String:"+ob);
        sc.close();
    }    
}
