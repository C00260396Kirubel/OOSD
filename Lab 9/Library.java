import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(new Book("Book", "B1", "J.K. Rowling", "Harry Potter and the Philosopher's Stone", 300));
        items.add(new CD("CD", "C1", "The Beatles", "Abbey Road", 14));
        
        for (LibraryItem item : items) {
            if (item instanceof LoanItem) {
                System.out.println("Type: " + item.getType());
                System.out.println("ID: " + item.getID());
                System.out.println("Price: $" + ((LoanItem) item).calculatePrice());
                System.out.println();
            }
        }
    }
}
