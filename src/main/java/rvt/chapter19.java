package rvt;

import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args){
       
        ex1();
        ex2();
    }
    public static void ex1(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter Start: ");
        int start = scanner.nextInt();
        System.out.print("Enter End: ");
        int end = scanner.nextInt();
        
        System.out.println("Numbers:");
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

    }
    public static void ex2(){
         Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter N: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
        

    }
}
