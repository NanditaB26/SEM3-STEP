import java.util.Scanner;
public class InventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        int max = sectionA[0];
        String section = "A";
        int index = 0;
        // Calculate total and maximum in Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "A";
                index = i;
            }
        }
        // Calculate total and maximum in Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "B";
                index = i;
            }
        }
        System.out.println("\nSection A Total = " + totalA);
        System.out.println("Section B Total = " + totalB);
        if (totalA == totalB)
            System.out.println("Status : Balanced");
        else
            System.out.println("Status : Not Balanced");
        System.out.println("Highest Quantity = " + max);
        System.out.println("Found in Section " + section + " at Item " + (index + 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = sc.nextInt();
        }
        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = sc.nextInt();
        }
        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}