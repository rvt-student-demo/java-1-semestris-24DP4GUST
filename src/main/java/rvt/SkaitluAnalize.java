package rvt;
import java.util.Scanner;

public class SkaitluAnalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int skaits = 0;
        int summa = 0;
        int lielakais = 0;
        int mazakais = 999999;
        
        System.out.println("Ievadi skaitlus (0 lai beigtu):");
        
        while (true) {
            int sk = scanner.nextInt();
            if (sk <= 0) break;
            
            skaits++;
            summa += sk;
            if (sk > lielakais) lielakais = sk;
            if (sk < mazakais) mazakais = sk;
        }
        
        System.out.println("Skaits: " + skaits);
        System.out.println("Summa: " + summa);
        if (skaits > 0) {
            System.out.println("Videjais: " + (summa * 1.0 / skaits));
            System.out.println("Lielakais: " + lielakais);
            System.out.println("Mazakais: " + mazakais);
        }
        

    }
}