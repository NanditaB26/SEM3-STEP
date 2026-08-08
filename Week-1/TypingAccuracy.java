import java.util.Scanner;
public class TypingAccuracy {
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i + 1;
            }
        }
        double accuracy = (matched * 100.0) / original.length();
        System.out.println("Matched Characters : " + matched + "/" + original.length());
        System.out.printf("Accuracy : %.2f%%\n", accuracy);
        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at Position : " + firstMismatch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original String: ");
        String original = sc.nextLine();
        System.out.print("Enter Typed String: ");
        String typed = sc.nextLine();
        if (original.length() != typed.length()) {
            System.out.println("Both strings must have the same length.");
        } else {
            checkTypingAccuracy(original, typed);
        }
        sc.close();
    }
}