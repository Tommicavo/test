package servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BookService;
import utils.StorageInfo;

@WebServlet("/Query3Servlet")
public class Query3Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BookService bookService = new BookService();
		List<StorageInfo> storageList = bookService.findStorageData();
    	request.setAttribute("storageList", storageList);
        RequestDispatcher rd = request.getRequestDispatcher("/query3.jsp");
        rd.forward(request, response);
    }
}
