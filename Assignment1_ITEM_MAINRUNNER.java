	/*Week 7 Assignment 1 - JDBC Exercises 1
	Create the following table:
	
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
import java.util.List;

public class Assignment1_ITEM_MAINRUNNER {

	public static void main(String[] args) throws SQLException {

		
		// QUESTION 1 OF 3
		System.out.println("---------------------QUESTION 1 of 3---------------------\r\n");

		ItemDAO itemDAO = new ItemDAO();
		Item item = itemDAO.getItemById(4);

		String searchResult = "ID : " + item.getId() + " | Item Name : " + item.getName() + " | Quantitity : "
				+ item.getQuantity_in_stock() + " | Price : " + item.getPrice();

		System.out.println(searchResult);
		
		
//-----------------------------------------------------------------------------------
		
		
		// QUESTION 2 of 3
		System.out.println("\r\n---------------------QUESTION 2 of 3---------------------\r\n");

		ItemDAO itemDAO2 = new ItemDAO();
		List<Item> item2 = itemDAO2.getItemsCostingGreaterThan(2);
		int counter2 = 0;

		for (Item elements : item2) {
			System.out.println("ID : " + elements.getId() + " | Item Name : " + elements.getName() + " | Quantitity : "
					+ elements.getQuantity_in_stock() + " | Price : " + elements.getPrice());
			counter2++;
		}
		
		System.out.println("\r\nOnly " + counter2 + " type of items greater than your requested price!");

		
//-----------------------------------------------------------------------------------
		
		
		// QUESTION 3 of 3
		System.out.println("\r\n---------------------QUESTION 3 of 3---------------------\r\n");
		
		ItemDAO itemDAO3 = new ItemDAO();
		List<Item> item3 = itemDAO3.getItemsInStock();
		int counter3 = 0;
		
		for (Item elements : item3) {
			System.out.println("ID : " + elements.getId() + " | Item Name : " + elements.getName() + " | Quantitity : "
					+ elements.getQuantity_in_stock() + " | Price : " + elements.getPrice());
			counter3++;
		}
		
		System.out.println("\r\nOnly " + counter3 + " type of items in stock!");			
	}
}
