package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<Integer> pages = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pageCount = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            
            titles.add(title);
            pages.add(pageCount);
            years.add(year);
        }

        System.out.print("\nWhat information will be printed? ");
        String command = scanner.nextLine();

        if (command.equals("everything")) {
            for (int i = 0; i < titles.size(); i++) {
                System.out.println(titles.get(i) + ", " + pages.get(i) + " pages, " + years.get(i));
            }
        } else if (command.equals("name")) {
            for (String title : titles) {
                System.out.println(title);
            }
        }
    }
}