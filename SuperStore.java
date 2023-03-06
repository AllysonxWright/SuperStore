
class Item {
	private String productName;
	private int quantity;
	private double unitPrice;

	Item(String productName, int quantity, double unitPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
    }
}


class Store
{
  public static void main(String[] args)
  {
    Item i1 = new Item("McDonalds French Fries ", 7, 4.0);
    Item i2 = new Item("10 piece McDonalds Chicken Nuggets", 10, 8.0);
    Item i3 = new Item("Chick-Fil-A Chicken Sandwhich", 4, 6.0);
    Item i4 = new Item("Shake Shack Burger", 10, 10.0);
    Item i5 = new Item("Jerk Chicken", 9, 15.0);
    Item i6 = new Item("Dim Sum ", 9, 15.0);
    Item i7 = new Item("10 piece McDonalds Chicken Nuggets", 10, 8.0);
    Item i8 = new Item("2 scoop Ice Cream Cone ", 5, 6.0);
    Item i9 = new Item("Chocolate chip cookie ", 5, 4.0);
    Item i10 = new Item("C", 6, 15.0);
  }
}


