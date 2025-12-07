package rvt;
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ievadi pirmo skaitli");
        int first = scanner.nextInt();

        System.out.println("Ievadi otro skaitli");
        int second = scanner.nextInt();

        System.out.println("Ievadi trešo skaitli");
        int third = scanner.nextInt();

        double average = (first + second + third) / 3.0;

        System.out.println("Videjais ir:"+average);

    }
    
}
