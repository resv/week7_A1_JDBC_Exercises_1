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

import java.sql.SQLException;

public class Assignment1_ITEM_MAINRUNNER {

	public static void main(String[] args) throws SQLException {

		ItemDAO itemDAO = new ItemDAO();
		Item item = itemDAO.getItemById(4);
			String searchResult = "ID : " + item.getId() + " | Item Name : " + 
					item.getName() + " | Quantitity : " + item.getQuantity_in_stock() + 
					" | Price : " + item.getPrice();
		System.out.println(searchResult);
		
		//NEED TO CALL THIS BETTER WITH OUT getting bugged from prior method
		Item greater item = itemDAO.getItemById(4);
		getItemsCostingGreaterThan(5);

		
	}

}
