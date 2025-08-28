package Assignment_1a;

public class Order {
    // Private
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    // Adds items to the menu
    public void addItem1(MenuItem item) {
        this.item1 = item;
    }

    public void addItem2(MenuItem item) {
        this.item2 = item;
    }

    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    // Calculates the total for the order
    public double calculateTotal() {
        double item1_cost = item1.getPrice();
        double item2_cost = item2.getPrice();
        double item3_cost = item3.getPrice();
        totalAmount = item1_cost + item2_cost + item3_cost;
        return totalAmount;
    }

    // Displays all relevant order details to the user
    public void displayOrderDetails() {
        System.out.println(" ");
        System.out.println("Item 1: " + item1.getName());
        System.out.println("Price: $" + item1.getPrice());
        System.out.println("Category: " + item1.getCategory());

        System.out.println(" ");
        System.out.println("Item 2: " + item2.getName());
        System.out.println("Price: $" + item2.getPrice());
        System.out.println("Category: " + item2.getCategory());

        System.out.println(" ");
        System.out.println("Item 3: " + item3.getName());
        System.out.println("Price: $" + item3.getPrice());
        System.out.println("Category: " + item3.getCategory());

        System.out.println(" ");
        System.out.println("Total: $" + calculateTotal());
    }
}
