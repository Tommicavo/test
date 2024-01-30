package application;

import java.util.List;
import java.util.Map;
import model.bean.BookBean;
import model.bean.UserBean;
import model.dao.BookDao;

public class App {
    public static void main(String[] args) {
        BookDao bookDao = new BookDao();
        
        // QUERY 1
        List<Map<UserBean, Integer>> result = bookDao.findUsersWithMoreThanFiveBooks(); // HAVING BOOK_COUNT >= 1!

        for (Map<UserBean, Integer> map : result) {
            for (Map.Entry<UserBean, Integer> entry : map.entrySet()) {
                UserBean user = entry.getKey();
                int bookCount = entry.getValue();

                System.out.println("UserBean: \n" + user);
                System.out.println("Book Count: " + bookCount);
                System.out.println("----------------------------------------");
            }
        }
        
        // QUERY 2
        List<BookBean> books = bookDao.findBooksByAuthor(1L);
        for (BookBean book : books) {
        	System.out.println(book);
        }
        
        // QUERY 3
        List<Map<String, Integer>> titleCountMap = bookDao.getBooksCount();
        
        for (Map<String, Integer> map : titleCountMap) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String title = entry.getKey();
                Integer count = entry.getValue();

                System.out.println("Title: " + title + ", Count: " + count);
                System.out.println("----------------------------------------");
            }
        }   
    }
}
