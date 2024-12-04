import java.util.Scanner;

public class InventoryManagementSystem {
     public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item to Inventory");
            System.out.println("2. Remove Item from Inventory");
            System.out.println("3. Display Inventory");
            System.out.println("4. Check Low Stock Items");
            System.out.println("5. Create Shopping List");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    // Add item to inventory
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    Item newItem = new Item(name, price, quantity, category);
                    inventory.addItem(newItem);
                    System.out.println("Item added!");
                    break;

                case 2:
                    // Remove item from inventory
                    System.out.print("Enter the name of the item to remove: ");
                    String itemName = scanner.nextLine();
                    inventory.removeItem(itemName);
                    System.out.println("Item removed, if it existed.");
                    break;

                case 3:
                    // Display inventory
                    System.out.println("\nCurrent Inventory:");
                    inventory.displayItems();
                    break;

                case 4:
                    // Check low stock items
                    System.out.print("Enter stock threshold: ");
                    int threshold = scanner.nextInt();
                    StockAlert stockAlert = new StockAlert(inventory, threshold);
                    stockAlert.checkLowStock();
                    break;

                case 5:
                    // Generate shopping list
                    ShoppingList shoppingList = new ShoppingList();
                    System.out.print("Enter item name for shopping list (type 'done' to stop): ");
                    while (true) {
                        String itemToShop = scanner.nextLine();
                        if (itemToShop.equalsIgnoreCase("done")) {
                            break;
                        }
                        Item foundItem = inventory.findItem(itemToShop);
                        if (foundItem != null) {
                            shoppingList.addToShoppingList(foundItem);
                        } else {
                            System.out.println("Item not found in inventory.");
                        }
                    }
                    shoppingList.displayShoppingList();
                    break;

                case 6:
                    // Exit
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 6.");
                    break;
            }
        }

        scanner.close();
    }
}
