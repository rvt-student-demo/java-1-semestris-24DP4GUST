package rvt;
import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ievadi Savus % (0-100)");
    int points = scanner.nextInt();

    if (points < 0){
        System.out.println("Nav iespejams");
    }else if (points <= 49){
        System.out.println("NV");
    }else if (points <= 59){
        System.out.println("Atzime: 1");    
    }else if (points <= 69){
        System.out.println("Atzime: 2");
    }else if (points <= 79){
        System.out.println("Atzime: 3");
    }else if (points <= 89){
        System.out.println("Atzime: 4");
    }else if (points <= 100){
        System.out.println("Atzime: 5");
    }else{
        System.out.println("wow");
    }

    }


}
