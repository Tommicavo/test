<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="model.bean.UserBean" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Query1</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <h2>Clienti che hanno acquistato almeno 1 libro</h2>
        <%
            List<Map<UserBean, Integer>> result = (List<Map<UserBean, Integer>>)request.getAttribute("result");
            
            for (Map<UserBean, Integer> map : result) {
                for (Map.Entry<UserBean, Integer> entry : map.entrySet()) {
                    UserBean user = entry.getKey();
                    int bookCount = entry.getValue();
        %>
                    <div class="py-4">
                        <div><strong>UserBean:</strong></div>
                        <div>Id: <%= user.getIdUser() %></div>
                        <div>Name e Cognome: <%= user.getFirstNameUser() %> <%= user.getLastNameUser() %></div>
                        <div>Premium: <%= user.isPremiumUser() %></div>
                        <div>Book Count: <%= bookCount %></div>
                    </div>
        <%
                }
            }
        %>
    </body>
</html>
