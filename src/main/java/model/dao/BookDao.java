package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.bean.BookBean;
import model.bean.UserBean;
import utils.DbConnection;

public class BookDao {
	
	public List<Map<UserBean, Integer>> findAllUsersWithMoreThanFiveBooks() { 
	    String query = "SELECT user.*, COUNT(id_book) AS book_count FROM user\r\n"
	            + "JOIN book ON user.id_user = book.id_client\r\n"
	            + "GROUP BY user.id_user\r\n"
	            + "HAVING book_count >= 1;";

	    DbConnection dbCon = new DbConnection();
	    Connection con = dbCon.getConnection();

	    Statement st = null;
	    List<Map<UserBean, Integer>> userBookMapList = new ArrayList<>();
	    try {
	        st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);

	        while (rs.next()) {
	            UserBean userBean = new UserBean();
	            
	            userBean.setIdUser(rs.getLong("id_user"));
	            userBean.setFirstNameUser(rs.getString("first_name"));
	            userBean.setLastNameUser(rs.getString("last_name"));
	            userBean.setEmailUser(rs.getString("email"));
	            userBean.setPasswordUser(rs.getString("password"));
	            userBean.setInsertDateUser(rs.getTimestamp("insert_date").toLocalDateTime());
	            userBean.setUpdateDateUser(rs.getTimestamp("update_date").toLocalDateTime());
	            userBean.setDeletedUser(rs.getBoolean("is_deleted"));
	            userBean.setPremiumUser(rs.getBoolean("is_premium"));
	            userBean.setIdRole(rs.getLong("id_role"));            

	            int bookCount = rs.getInt("book_count");

	            Map<UserBean, Integer> userBookMap = new HashMap<>();
	            userBookMap.put(userBean, bookCount);

	            userBookMapList.add(userBookMap);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        dbCon.closeConnection(con);
	    }
	    return userBookMapList;
	}
	
	public List<BookBean> findBooksByAuthor(Long authorId) {
		String query = "SELECT * FROM book WHERE id_author=? ORDER BY publication_date DESC;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, authorId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ResultSet rs;
		List<BookBean> books = new ArrayList<>();
		
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				BookBean bookBean = new BookBean();
				
				bookBean.setIdBook(rs.getLong("id_book"));
				bookBean.setTitleBook(rs.getString("title"));
				bookBean.setPagesBook(rs.getInt("pages"));
				bookBean.setIdAuthor(rs.getLong("id_author"));
				bookBean.setIdClient(rs.getLong("id_client"));
				bookBean.setIdSeller(rs.getLong("id_seller"));
				bookBean.setInsertDateBook(rs.getTimestamp("insert_date").toLocalDateTime());
				bookBean.setUpdateDateBook(rs.getTimestamp("update_date").toLocalDateTime());
				bookBean.setDeletedBook(rs.getBoolean("is_deleted"));
				bookBean.setPriceBook(rs.getDouble("price"));
				bookBean.setLowBook(rs.getBoolean("is_low"));
				bookBean.setPublicationDateBook(rs.getDate("publication_date").toLocalDate());
				
				books.add(bookBean);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		
		return books;
	}
	
	public List<Map<String, Integer>> getBooksCount() {
		String query = "SELECT title, COUNT(id_book) AS count\r\n"
				+ "FROM book\r\n"
				+ "GROUP BY title;";
		
	    DbConnection dbCon = new DbConnection();
	    Connection con = dbCon.getConnection();
		
	    Statement st = null;
	    List<Map<String, Integer>> userTitleCountList = new ArrayList<>();
	    try {
	        st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);

	        while (rs.next()) {
	            Map<String, Integer> titleCount = new HashMap<>();
	            String title = rs.getString("title");
	            Integer count = rs.getInt("count");
	            titleCount.put(title, count);

	            userTitleCountList.add(titleCount);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        dbCon.closeConnection(con);
	    }
	    return userTitleCountList;
	}
}
