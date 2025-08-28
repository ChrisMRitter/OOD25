package Assignment_1a;
import java.util.Scanner;

public class Cafe {
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;

    Scanner scanner = new Scanner(System.in);

    // Adds user-specified menu item to slot 1
    void addMenuItem1() {
        menuItem1 = new MenuItem();
        System.out.print("Enter the name of the first menu item: ");
        menuItem1.setName(scanner.nextLine());
        System.out.print("Enter a valid number for the price of the first menu item: ");
        menuItem1.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter the category of the first menu item: ");
        menuItem1.setCategory(scanner.nextLine());

        System.out.println(" ");
    }

    // Adds user-specified menu item to slot 2
    void addMenuItem2() {
        menuItem2 = new MenuItem();
        System.out.print("Enter the name of the second menu item: ");
        menuItem2.setName(scanner.nextLine());
        System.out.print("Enter a valid number for the price of the second menu item: ");
        menuItem2.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter the category of the second menu item: ");
        menuItem2.setCategory(scanner.nextLine());

        System.out.println(" ");
    }

    // Adds user-specified menu item to slot 3
    void addMenuItem3() {
        menuItem3 = new MenuItem();
        System.out.print("Enter the name of the third menu item: ");
        menuItem3.setName(scanner.nextLine());
        System.out.print("Enter a valid number for the price of the third menu item: ");
        menuItem3.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter the category of the third menu item: ");
        menuItem3.setCategory(scanner.nextLine());

        System.out.println(" ");
    }

    // Takes user input to place a desired order, displays the order details, and calculates total cost
    void placeOrder() {
        Order currentOrder = new Order();
        int option;
        System.out.println("Enter 1, 2, or 3 to order the corresponding item.");
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                System.out.print("Enter your first option: ");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        currentOrder.addItem1(menuItem1);
                        break;
                    case 2:
                        currentOrder.addItem1(menuItem2);
                        break;
                    case 3:
                        currentOrder.addItem1(menuItem3);
                        break;
                    default:
                        System.out.println("That is not a valid option, please try again.");
                        break;
            }
            } else if (i == 1) {
                System.out.print("Enter your second option: ");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        currentOrder.addItem2(menuItem1);
                        break;
                        case 2:
                            currentOrder.addItem2(menuItem2);
                            break;
                            case 3:
                                currentOrder.addItem2(menuItem3);
                                break;
                                default:
                                    System.out.println("That is not a valid option, please try again.");
                }
            } else if (i == 2) {
                System.out.print("Enter your third option: ");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        currentOrder.addItem3(menuItem1);
                        break;
                        case 2:
                            currentOrder.addItem3(menuItem2);
                            break;
                            case 3:
                                currentOrder.addItem3(menuItem3);
                                break;
                                default:
                                System.out.println("That is not a valid option, please try again.");
                                break;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Thank you for using Chris's Café!");
        System.out.println("Your order has been placed successfully. Here is your receipt: ");
        currentOrder.displayOrderDetails();
        System.out.println(" ");
        System.out.println("Have a nice day!");
    }

    // Displays user-created menu
    void displayMenu() {
        System.out.println("Hi, Welcome to Chris's Café, where you can only order 3 items! How can I help you today?");
        System.out.println(" ");
        System.out.println("Menu:");
        System.out.println(" ");
        System.out.println("Number 1: ");
        menuItem1.displayItemDetails();
        System.out.println(" ");
        System.out.println("Number 2: ");
        menuItem2.displayItemDetails();
        System.out.println(" ");
        System.out.println("Number 3: ");
        menuItem3.displayItemDetails();
        System.out.println(" ");
    }

}
