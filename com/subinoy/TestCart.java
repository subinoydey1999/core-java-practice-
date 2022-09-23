/*
Program: Creating of Cart
@author: subinoy dey
@date: 23.09.22
*/



class TestCart
{
	public static void main(String ...args)
	{
		//----Constructor injection-------//
		Item pen = new Item ("Ball Pen",5,50);
		Item mobile= new Item("Fruits",14,200);
		Item chocolate = new Item("Dairy Milk", 10,40);
		Item book = new Item("Laptop",1,30000);
		Item chips= new Item("Onion",2,40);

		ShoppingCart myCart= new ShoppingCart();

		myCart.addItem(pen);
		myCar(fruits);
		myCart.addItem(chocolate);
		myCart.addItem(laptop);
		myCart.addItem(onion);

		System.out.println("-------------");

		System.out.println("Bill Amount :"+myCart.calculateBill());
		System.out.println("-------------");


	}


}