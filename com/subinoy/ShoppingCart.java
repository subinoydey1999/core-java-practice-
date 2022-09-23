/*
Program: Shopping cart
@author: subinoy dey
@date: 23.09.22
*/
class ShoppingCart
{
	private Item[] cart;
	private double billAmount;
	private int storedItem;
	// constructor to create cart of 5 item
	ShoppingCart()
	{
		cart= new Item[5]
	}
    // constructor to create cart of n item
     ShoppingCart(int size)
	{
	cart= new Item[size]
	}
	// method to add item in the cart
	public void add Item(Item input)
	{
		if(storedItem<cart.length)
		{
           cart[storedItem]=input;
           storedItems++;
    // to print item added in my cart
      System.out.println(input.getName() + ": " + input.getTotalPrice());
	    }
		else
	}
    {System.out.println("Shopping cart is full");
	}
}	