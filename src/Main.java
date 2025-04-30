import inventory.Inventory;
import products.*;
public class Main {
    public static void main(String[] args) {
        // Inventories
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        // Create and add products
        Book book1 = new Book("Java Basics", 100.0, "Author A", "Pub X", "Education");
        Book book2 = new Book("Advanced Java", 150.0, "Author B", "Pub Y", "Education");
        bookInventory.addItem(book1);
        bookInventory.addItem(book2);

        Notebook notebook1 = new Notebook("Spiral Notebook", 30.0, 200, true);
        Notebook notebook2 = new Notebook("Softcover Notebook", 20.0, 150, false);
        notebookInventory.addItem(notebook1);
        notebookInventory.addItem(notebook2);

        Accessory accessory1 = new Accessory("Blue Pen", 5.0, "Blue");
        Accessory accessory2 = new Accessory("Red Pen", 6.0, "Red");
        accessoryInventory.addItem(accessory1);
        accessoryInventory.addItem(accessory2);

        // Remove one item by ID (example: remove book1)
        bookInventory.removeItemById(book1.getId());

        // Find and print two items by ID
        Product foundNotebook = notebookInventory.findItemById(notebook1.getId());
        Product foundAccessory = accessoryInventory.findItemById(accessory2.getId());
        System.out.println("Found notebook: " + foundNotebook);
        System.out.println("Found accessory: " + foundAccessory);

        // Apply discount
        bookInventory.applyDiscount("Advanced Java", 10); // 10% discount
        accessoryInventory.applyDiscount("Red Pen", 20);  // 20% discount

        // Display all
        System.out.println("Books:");
        bookInventory.displayAll();

        System.out.println("Notebooks:");
        notebookInventory.displayAll();

        System.out.println("Accessories:");
        accessoryInventory.displayAll();

        // Calculate total price
        double total = calculateTotalPrice(bookInventory) +
                calculateTotalPrice(notebookInventory) +
                calculateTotalPrice(accessoryInventory);
        System.out.println("Total price of all products: " + total);
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0.0;
        for (Product p : inventory.getItems()) {
            total += p.getPrice();
        }
        return total;
    }
}
