import java.util.Scanner;

class mulocc {
    public static void occurance(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int count = 0;
        char ch = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > count) {
                count = freq[i];
                ch = (char) i;
                System.out.println(ch + ": " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String:");
        String str = sc.nextLine();
        occurance(str);
        sc.close();
    }
}
