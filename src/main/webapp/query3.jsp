<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@page import="utils.StorageInfo"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Query2</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2>Magazzino</h2>
            
            <%  List<StorageInfo> storageList = (List<StorageInfo>) request.getAttribute("storageList"); %>
                
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Titolo</th>
                        <th scope="col">Quantità</th>
                        <th scope="col">In esaurimento</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (StorageInfo storageInfo : storageList) { %>
                        <tr>
                            <td><%= storageInfo.getTitle() %></td>
                            <td><%= storageInfo.getCount() %></td>
                            <td><%= storageInfo.isLow() %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </body>
</html>
