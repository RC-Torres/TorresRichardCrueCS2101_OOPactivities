import models.Book;
import models.DVD;
import models.Item;
import services.Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        Book book1 = new Book(1, "[1] Boruto", "Masashi Kishimoto", 700);
        Book book2 = new Book(2, "[2] Attack on Titan: Season 1", "Hajime Isayama", 500);
        DVD dvd1 = new DVD(3, "[3] Fairy Tail", "Bones Studio", 120);
        DVD dvd2 = new DVD(4, "[4] One Piece: Grand Line", "Oda", 180);
        
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display All Items");
            System.out.println("2. Search for an Item");
            System.out.println("3. Borrow an Item");
            System.out.println("4. Return an Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    library.displayAllItems();
                    break;

                case 2:
                    System.out.print("Enter title to search: ");
                    String title = scanner.nextLine().trim();  
                    Item item = library.searchByTitle(title);
                    
                    if (item != null) {
                        item.displayDetails(); 
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the ID of the item you want to borrow: ");
                    int borrowId = scanner.nextInt();
                    boolean borrowed = library.borrowItem(borrowId);
                    if (!borrowed) {
                        System.out.println("Item could not be borrowed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the ID of the item you want to return: ");
                    int returnId = scanner.nextInt();
                    library.returnItem(returnId);
                    break;

                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
