import java.util.Scanner;

public class filter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.print("After filtration new string is:  ");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1' || str.charAt(i)=='2' ||str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || 
            str.charAt(i)=='6' ||str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9' || str.charAt(i)=='!' ||
            str.charAt(i)=='@' || str.charAt(i)=='#' ||str.charAt(i)=='$' || str.charAt(i)=='%' || str.charAt(i)=='^' || 
            str.charAt(i)=='&' ||str.charAt(i)=='*' ){
                continue;
            }else{
                System.out.print(str.charAt(i));
            }
        }
        in.close();
    }
}
