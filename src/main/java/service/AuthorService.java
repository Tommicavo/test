package service;

import java.util.List;

import model.bean.AuthorBean;
import model.dao.AuthorDao;

public class AuthorService {
	public List<AuthorBean> findAllAuthors() {
		AuthorDao authorDao = new AuthorDao();
		
		List<AuthorBean> authors = authorDao.findAll();
		return authors;
	}
}
