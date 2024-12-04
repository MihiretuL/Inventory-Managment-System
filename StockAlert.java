// Class to handle stock alerts
class StockAlert {
    private Inventory inventory;
    private int threshold;

    public StockAlert(Inventory inventory, int threshold) {
        this.inventory = inventory;
        this.threshold = threshold;
    }

    public void checkLowStock() {
        System.out.println("\nLow stock items:");
        boolean hasLowStock = false;
        for (Item item : inventory.getItems()) {
            if (item.getQuantity() <= threshold) {
                System.out.println(item);
                hasLowStock = true;
            }
        }
        if (!hasLowStock) {
            System.out.println("No items are low in stock.");
        }
    }
}