package rvt;
import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {

        final int SCREW = 5;   
        final int NUT = 3;     
        final int WASHER = 1;  

        Scanner sc = new Scanner(System.in);

        System.out.print("Skruvju skaits: ");
        int s = sc.nextInt();

        System.out.print("Uzgrieznu skaits: ");
        int u = sc.nextInt();

        System.out.print("Paplaksnu skaits: ");
        int p = sc.nextInt();

        boolean kluda = false;

        if (u < s) {
            System.out.println("Par maz uzgrieznu");
            kluda = true;
        }
        

        if (p < s * 2) {
            System.out.println("Par maz paplaksnu");
            kluda = true;
        }

        if (!kluda) {
            int cena = s * SCREW + u * NUT + p * WASHER;
            System.out.println("Pasūtījums ir kārtībā");
            System.out.println("Kopējā cena: " + cena);
        }
    }
}

