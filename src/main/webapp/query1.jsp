<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="model.bean.UserBean" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Query 1</title>
</head>
<body>
    <h2>Query 1</h2>

    <%
        List<Map<UserBean, Integer>> result = (List<Map<UserBean, Integer>>)request.getAttribute("result");
        
        for (Map<UserBean, Integer> map : result) {
            for (Map.Entry<UserBean, Integer> entry : map.entrySet()) {
                UserBean user = entry.getKey();
                int bookCount = entry.getValue();
    %>
                <div class="py-4">
                    <div><strong>UserBean:</strong></div>
                    <div>ID: <%= user.getIdUser() %></div>
                    <div>Name: <%= user.getFirstNameUser() %></div>

                    <div><strong>Book Count:</strong> <%= bookCount %></div>
                </div>
    <%
            }
        }
    %>
</body>
</html>
