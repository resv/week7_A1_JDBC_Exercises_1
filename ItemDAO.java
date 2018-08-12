package week7_A1_JDBC_Exercises_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO extends AbstractDAO{

	
	Item getItemById(int id) throws SQLException {
		getConnection();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		Item item = new Item();
		
		try {
			conn = AbstractDAO.getConnection();
			String sql = "SELECT * FROM ITEM\r\n" + 
						"WHERE ID=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			result = ps.executeQuery();
			if (result.next()) {
				
				item.setId(result.getInt(1));
				item.setName(result.getString(2));
				item.setQuantity_in_stock(result.getInt(3));
				item.setPrice(result.getDouble(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
			if (result != null) {
				result.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
//		System.out.println("test");
		return item;
	}

	List<Item> getItemsCostingGreaterThan(double price) {
		List<Item> arr = new ArrayList<>();
		getConnection();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		Item item = new Item();
		
		try {
			conn = AbstractDAO.getConnection();
			String sql = "SELECT * FROM ITEM\r\n" + 
						"WHERE PRICE>?";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, price);
			result = ps.executeQuery();
			
			// NEED TO USE BETTER QUERY, AND CHECKER FOR PRICE ABOVE THIS AND BELOW THIS
			
			while (result.next()) {
				
				item.setId(result.getInt(1));
				item.setName(result.getString(2));
				item.setQuantity_in_stock(result.getInt(3));
				item.setPrice(result.getDouble(4));
				arr.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
			if (result != null) {
				result.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
//		System.out.println("test");
		return arr;
	}

	

	List<Item> getItemsInStock() {

		/*
		 * getItemsInStock() Arguments: None Returns: A list of items (type List) which
		 * have a quantity_in_stock greater than 0
		 */
		return null;
	}

}
