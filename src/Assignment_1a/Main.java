package Assignment_1a;

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // Adds user's items to the menu
        cafe.addMenuItem1();
        cafe.addMenuItem2();
        cafe.addMenuItem3();

        // Displays the menu back to the user and prompts for ordering
        cafe.displayMenu();
        cafe.placeOrder();
    }
}
