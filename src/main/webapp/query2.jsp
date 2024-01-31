<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.bean.AuthorBean" %>
<%@ page import="model.bean.BookBean" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Query2</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <h2>Lista degli autori</h2>
        <h5>Clicca su uno di loro per vedere i libri che ha pubblicato</h5>
        
        <%  List<AuthorBean> authors = (List<AuthorBean>) request.getAttribute("authors"); %>
        <%  List<BookBean> books = (List<BookBean>) request.getAttribute("books"); %>
        
        <% for (AuthorBean author : authors) { %>
            <form action="/ecommerce/Query2Servlet" method="POST" class="d-flex align-items-center">
                <input type="hidden" name="idAuthor" value="<%= author.getIdAuthor() %>">
                <div class="py-4">
                    <span> <%= author.getFirstNameAuthor() %> </span>
                    <span> <%= author.getLastNameAuthor() %> </span>
                </div>
                <div>
                    <button type="submit" class="btn btn-info">Libri</button>
                </div>
            </form>
        <% } %>

        <ul>                
            <% if (books != null && books.size() > 0) { %>
                <% for (BookBean book : books) { %>
                    <li>
                        <span><%= book.getTitleBook() %></span>
                        <span> - <%= book.getPriceBook() %></span>
                        <span> - <%= book.getPublicationDateBook() %></span>
                    </li>
                <% }
            } %>
        </ul>
    </body>
</html>
