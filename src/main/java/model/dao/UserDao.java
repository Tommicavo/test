package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.bean.BookBean;
import model.bean.UserBean;
import utils.DbConnection;

public class UserDao {
	
	public int update(UserBean userBean) {
	    String query = "UPDATE user SET first_name=?, last_name=?, email=?, password=?, id_role=?, update_date=?, is_deleted=?, is_premium=? WHERE id_user=?";
	    
	    DbConnection dbCon = new DbConnection();
	    Connection con = dbCon.getConnection();
	    
	    PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			
		    ps.setString(1, userBean.getFirstNameUser());
	        ps.setString(2, userBean.getLastNameUser());
	        ps.setString(3, userBean.getEmailUser());
	        ps.setString(4, userBean.getPasswordUser());
	        ps.setLong(5, userBean.getIdRole());
	        ps.setTimestamp(6, Timestamp.valueOf(userBean.getUpdateDateUser()));
	        ps.setBoolean(7, userBean.isDeletedUser());
	        ps.setBoolean(8, userBean.isPremiumUser());
	        ps.setLong(9, userBean.getIdUser());
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        int updateOutput = 0;
		try {
			updateOutput = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        dbCon.closeConnection(con);
        
        return updateOutput;
	}
	
	public List<BookBean> getBooks(Long idUser) {
		String query = "SELECT * FROM book WHERE id_client=?;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, idUser);
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
				bookBean.setPriceBook(rs.getDouble("price"));
				bookBean.setLowBook(rs.getBoolean("is_low"));
				bookBean.setIdAuthor(rs.getLong("id_author"));
				bookBean.setIdClient(rs.getLong("id_client"));
				bookBean.setIdSeller(rs.getLong("id_seller"));
				bookBean.setInsertDateBook(rs.getTimestamp("insert_date").toLocalDateTime());
				bookBean.setUpdateDateBook(rs.getTimestamp("update_date").toLocalDateTime());
				bookBean.setDeletedBook(rs.getBoolean("is_deleted"));
				bookBean.setPublicationDateBook(rs.getDate("publication_date").toLocalDate());
				
				books.add(bookBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		
		return books;
	}
}
