package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.bean.BookBean;
import model.bean.UserBean;
import model.dao.BookDao;
import model.dao.UserDao;
import utils.StorageInfo;

public class BookService {
	
	public List<Map<UserBean, Integer>> findUsersWithMoreThanFiveBooks() {
		
		BookDao bookDao = new BookDao();
		UserDao userDao = new UserDao();
		
		List<Map<UserBean, Integer>> usersWithBooks = bookDao.findAllUsersWithMoreThanFiveBooks();
		List<UserBean> userList = new ArrayList<>();
		
        for (Map<UserBean, Integer> map : usersWithBooks) {
            for (Map.Entry<UserBean, Integer> entry : map.entrySet()) {
                UserBean user = entry.getKey();
                // int bookCount = entry.getValue();
                userList.add(user);
            }
        }
        
        // Questo controllo andrebbe fatto quando un cliente acquista un libro, ma avendo inserito i libri a mano su mysql lo faccio qua
        for (UserBean user : userList) {
        	List<BookBean> books = userDao.getBooks(user.getIdUser());
        	System.out.println("His books: " + books);
        	int numberOfExpensiveBooks = 0;
        	for (BookBean book : books) {
        		if (book.getPriceBook() >= 100.0) {
        			numberOfExpensiveBooks += 1;
        		}
        	}
        	if (numberOfExpensiveBooks >= 2) {
        		user.setPremiumUser(true);
        		userDao.update(user);
        	}
        }
        
        return bookDao.findAllUsersWithMoreThanFiveBooks();
	}
	
	public List<BookBean> findBooksByAuthor(Long idAuthor) {
		
		List<BookBean> books = new ArrayList<>();
		if (idAuthor != null) {
			BookDao bookDao = new BookDao();
			books = bookDao.findBooksByAuthor(idAuthor);
		}
		return books;
	}
	
	public List<StorageInfo> findStorageData() {
		
		BookDao bookDao = new BookDao();
		List<Map<String, Integer>> mapList = bookDao.getBooksCount();
		
		List<StorageInfo> storageList = new ArrayList<>();
		if (mapList != null) {
			for (Map<String, Integer> map : mapList) {
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					StorageInfo storageInfo = new StorageInfo();
					storageInfo.setTitle(entry.getKey());
					storageInfo.setCount(entry.getValue());
					if (storageInfo.getCount() < 3) {
						storageInfo.setLow(true);
					} else {
						storageInfo.setLow(false);
					}
					storageList.add(storageInfo);
				}
			}
		}
		return storageList;
	}
}
