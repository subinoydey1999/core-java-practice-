/*program: Class for Item
@author: subinoy dey
@date: 22.09.22
*/
class Item
{
	//instant variables
	private String name;
	private int qty;
	private double totalPrice;
    Item()// no of arg constructor
{
	}
	//paramaterized constructor
	Item(String name, double unitPrice)
	{
	this.name=name;
	this.qty=qty;
	this.totalPrice= qty* unitPrice;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
    {
		return this.name
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public String getQty()
    {
		return this.qty;
	}
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice=totalPrice;
	}
	public double getTotalPrice()
    {
		return this.totalPrice
	
	}
}