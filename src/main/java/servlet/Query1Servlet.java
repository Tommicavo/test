package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.UserBean;
import model.dao.BookDao;

@WebServlet("/Query1Servlet")
public class Query1Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	BookDao bookDao = new BookDao();
    	List<Map<UserBean, Integer>> result = bookDao.findUsersWithMoreThanFiveBooks();
    	
    	request.setAttribute("result", result);
        RequestDispatcher rd = request.getRequestDispatcher("/query1.jsp");
        rd.forward(request, response);
    }
}
