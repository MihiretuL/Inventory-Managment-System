// Class to represent an Item in the inventory
class Item extends Product{
    private int quantity;
    private String category;

    public Item(String name, double price, int quantity, String category) {
        super(name, price);
        this.quantity = quantity;
        this.category = category;
    }

   
    public int getQuantity() { return quantity; }
    public String getCategory() { return category; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

     @Override
    public String toString() {
        return super.toString() + " (" + category + ") - Quantity: " + quantity;
    }
}
