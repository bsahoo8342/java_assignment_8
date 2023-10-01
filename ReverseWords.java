import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.print(word + " ");
            word = reverse(word);
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static String reverse(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        return reversedWord;
    }
}
