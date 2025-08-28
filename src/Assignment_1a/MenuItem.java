package Assignment_1a;

public class MenuItem {
        // Private
        private String name;
        private double price;
        private String category;

        // Name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Category
        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        // Display Info
        public void displayItemDetails() {
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Category: " + category);
        }
}

