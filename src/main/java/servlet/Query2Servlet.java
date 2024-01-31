package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.AuthorBean;
import model.bean.BookBean;
import service.AuthorService;
import service.BookService;

@WebServlet("/Query2Servlet")
public class Query2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	AuthorService authorService = new AuthorService();
    	List<AuthorBean> authors = authorService.findAllAuthors();
    	request.setAttribute("authors", authors);
    	
        RequestDispatcher rd = request.getRequestDispatcher("/query2.jsp");
        rd.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	AuthorService authorService = new AuthorService();
    	List<AuthorBean> authors = authorService.findAllAuthors();
    	request.setAttribute("authors", authors);
    	
    	String strIdAuthor = request.getParameter("idAuthor");
    	if (strIdAuthor != null && !strIdAuthor.isEmpty()) {
    		Long idAuthor = Long.valueOf(strIdAuthor);
    		BookService bookService = new BookService();
    		List<BookBean> books = bookService.findBooksByAuthor(idAuthor);
    		System.out.println("Id Author: " + idAuthor);
    		System.out.println("Books: \n");
    		for (BookBean book : books) {
    			System.out.println(book);    		}
    		request.setAttribute("authors", authors);
    		request.setAttribute("books", books);
            RequestDispatcher rd = request.getRequestDispatcher("/query2.jsp");
            rd.forward(request, response);
    	}
    }
}
