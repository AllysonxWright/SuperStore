import java.util.ArrayList;
import java.util.Scanner;

public class SuperStore {

    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<Item>();
        inventory.add(new Item("McDonalds Chicken Nuggets", 8, 8.00));
        inventory.add(new Item("McDonalds French Fries", 7, 4.0));
        inventory.add(new Item("Chick-Fil-A Chicken Sandwhich", 4, 6.0));
        inventory.add(new Item("Shake Shack Burger", 7, 10.00));
        inventory.add(new Item("Jerk Chicken", 9, 15.00));
        inventory.add(new Item("Dim Sum", 9, 15.00));
        inventory.add(new Item("Pad Thai", 9, 15.00));
        inventory.add(new Item("Chicken and Vegetable Wontons", 10, 12.00));
        inventory.add(new Item("Curry Chicken and Rice", 14, 15.00));
        inventory.add(new Item("Cinammon Roll", 7, 9.00));
        inventory.add(new Item("2 scoop Ice Cream Cone", 5, 6.00));
        inventory.add(new Item("Chocolate chip cookie", 5, 4.00));
        
        System.out.println("Welcome to the store!");
        System.out.println("The goal of the game is to buy all of you rfavorite foods and spend all of your money. You will start with $1000. Enjoy!!");
        System.out.println("Here is a list of our inventory:");
        for (Item item : inventory) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity() + ", Price: $" + item.getPrice());
        }
        
        Scanner input = new Scanner(System.in);
        double balance = 1000.000; // the balance that the player starts with 
        ArrayList<Item> cart = new ArrayList<Item>();
        
        while (balance > 0) { // while loop that continues as long as the player has money left
            System.out.println("You have $" + balance + " to spend.");// starting balance displayed 
            System.out.println("What would you like to buy? Enter the name of the item or enter 'done' to exit.");
            String itemName = input.nextLine();
            if (itemName.equalsIgnoreCase("done")) { // if the player types done then they exit the game and it prints the following message 
                System.out.println("Thank you for shopping with us!");
                break;
            }
            Item item = null;
            for (Item i : inventory) {
                if (i.getName().equalsIgnoreCase(itemName)) {
                    item = i;
                    break;
                }
            }
            if (item == null) {// The following are all of the options that the user can get based on their input 
                System.out.println("Sorry, we don't have that item in stock.");
            } else if (item.getQuantity() == 0) {
                System.out.println("Sorry, that item is out of stock.");
            } else if (item.getPrice() > balance) {
                System.out.println("You don't have enough money to buy that item.");
            } else {
                balance -= item.getPrice();
                item.decrementQuantity();
                cart.add(item);
                System.out.println("You have bought " + item.getName() + " for $" + item.getPrice() + ".");
            }
        }
        
        System.out.println("You have run out of money.");// exits the loop because the player has no money left 
        System.out.println("Here is a list of the items you bought:");
        for (Item item : cart) {
            System.out.println(item.getName() + " - Price: $" + item.getPrice());
        }
    }
    
    public static class Item { // this is how the items will be displayed - Name, Quantity, and Price 
        private String name;
        private int quantity;
        private double price;
        
        public Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
        
        public String getName() {// so that it will print the follwing values 
            return name;
        }
        
        public int getQuantity() {
            return quantity;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void decrementQuantity() {
            quantity--;
        }
    }

}

/* I still have to figure out how to make things on sale and change the price 
 */ 
