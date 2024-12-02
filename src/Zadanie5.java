import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get word:");
        String word = scanner.nextLine();
        word = word.toLowerCase();
        boolean isPalindrom = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("This word is palindromem.");
        } else {
            System.out.println("This word not palindromem.");
        }
    }
}
