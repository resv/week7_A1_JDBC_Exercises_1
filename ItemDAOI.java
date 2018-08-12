package week7_A1_JDBC_Exercises_1;

import java.util.List;

public interface ItemDAOI{

	
	Item getItemById(int id);

	List<Item> getItemsCostingGreaterThan(double price);

	List<Item> getItemsInStock();
}
