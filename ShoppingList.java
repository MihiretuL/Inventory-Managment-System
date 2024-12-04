import java.util.ArrayList;
import java.util.List;

// Class to handle shopping list generation
class ShoppingList {
    private List<Item> shoppingList;

    public ShoppingList() {
        this.shoppingList = new ArrayList<>();
    }

    public void addToShoppingList(Item item) {
        shoppingList.add(item);
    }

    public void displayShoppingList() {
        if (shoppingList.isEmpty()) {
            System.out.println("Shopping list is empty.");
        } else {
            System.out.println("\nShopping List:");
            for (Item item : shoppingList) {
                System.out.println(item);
            }
        }
    }
}