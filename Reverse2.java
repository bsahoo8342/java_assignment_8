import java.util.Scanner;

class Reverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String str=sc.nextLine();
        String rstr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rstr=ch+rstr;
        }
        System.out.println("Reverse String:"+rstr);
    }
}
