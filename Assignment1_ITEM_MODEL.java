/*Create the following table:

Item
id - Integer, Primary Key
name - varchar2
quantity_in_stock - Integer
price - Number with 2 decimal places
 
Create a model based on the above table. It should contain getters and setters. Creating a constructor is optional.
 
Create a DAO with the following methods:

getItemById()
Arguments: The item id (type int) being searched for
Returns: The item (type Item) that is found
getItemsCostingGreaterThan()
Arguments: The item price (type double) you’re testing against
Returns: A list of items (type List) which have a price value greater than the given price
getItemsInStock()
Arguments: None
Returns: A list of items (type List) which have a quantity_in_stock greater than 0*/

package week7_A1_JDBC_Exercises_1;

public class Assignment1_ITEM_MODEL {
	
	//INSTANCIATE VARIABLES
	private int id;
	private String name;
	private int quantity_in_stock;
	private double price;
	
	//DEFAULT CONSTRUCTOR
	public Assignment1_ITEM_MODEL() {
	}

	//CONSTRUCTOR WITH FIELDS
	public Assignment1_ITEM_MODEL(int id, String name, int quantity_in_stock, double price) {
		this.id = id;
		this.name = name;
		this.quantity_in_stock = quantity_in_stock;
		this.price = price;
	}
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
