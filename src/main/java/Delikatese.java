import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi preci:");
        String product = scanner.nextLine();
        
        System.out.println("Ievadi cenu:");
        double price = scanner.nextDouble();
        
        System.out.println("Ekspress piegade (0==ne, 1==ja):");
        int express = scanner.nextInt();
        
        double delivery = 0;
        
        if (price < 10) {
            delivery = 2.00;
        }
        
        if (express == 1) {
            delivery = delivery + 3.00;
        }
        
        double total = price + delivery;
        
        System.out.println("Rekins:");
        System.out.println(product + ": " + price);
        System.out.println("piegade: " + delivery);
        System.out.println("kopa : " + total);
    }
}
