import java.util.ArrayList;
import java.util.List;

// Class to handle the inventory
class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The inventory is currently empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public Item findItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}