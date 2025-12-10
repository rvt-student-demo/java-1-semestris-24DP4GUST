package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        onlyTheseNumbers();
        listSize();
        onTheList();
    }
    
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            numbers.add(number);
        }

        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
    public static void listSize(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            list.add(input);
        }
        
        
        System.out.println("In total: " + list.size());


    }
    public static void onTheList(){
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    
    while (true) {
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            break;
        }
        
        list.add(input);
    }
   
    System.out.print("Search for? ");
    String searchFor = scanner.nextLine();
    
    if (list.contains(searchFor)) {
        System.out.println(searchFor + " was found!");
    } else {
        System.out.println(searchFor + " was not found!");
    }
    }
    public static void removeLast(){
        
        
    }
}