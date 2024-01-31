package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bean.AuthorBean;
import utils.DbConnection;

public class AuthorDao {
	
	public List<AuthorBean> findAll() {
		String query = "SELECT * FROM author;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		Statement st = null;
		List<AuthorBean> authors = new ArrayList<>();
		try {
			st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				AuthorBean authorBean = new AuthorBean();
				
				authorBean.setIdAuthor(rs.getLong("id_author"));
				authorBean.setFirstNameAuthor(rs.getString("first_name"));
				authorBean.setLastNameAuthor(rs.getString("last_name"));
				authorBean.setInsertDateAuthor(rs.getTimestamp("insert_date").toLocalDateTime());
				authorBean.setUpdateDateAuthor(rs.getTimestamp("update_date").toLocalDateTime());
				authorBean.setDeletedAuthor(rs.getBoolean("is_deleted"));
				
				authors.add(authorBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbCon.closeConnection(con);
		
		return authors;
	}
}
