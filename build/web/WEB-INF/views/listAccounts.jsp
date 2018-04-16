<%-- 
    Document   : listAccounts
    Created on : Apr 16, 2018, 1:22:44 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sulabh Banking App</title>
    </head>
    <body>
        <h1>Account Holder Details</h1>
        
        <table border="1">
            <tr>
                <th>Account No.</th>
                <th>Account Holder</th>
                <th>Balance</th>
                <th>Action</th>
                
            </tr>
        
        <c:forEach var="account" items="${accounts}" >
            
            <c:url var="updateLink" value="/edit" >
                <c:param name="accountNo" value="${account.accountNumber}"/>    
            </c:url>
            
            <c:url var="deleteLink" value="/delete" >
                <c:param name="accountNo" value="${account.accountNumber}" />
            </c:url>
           
            <tr>
                <td>${account.accountNumber}</td>
                <td>${account.accountHolderName}</td>
                <td>${account.balance}</td>
                
                <td>
                    <a href="${updateLink}">Edit</a>
                    <a href="${deleteLink}" onClick="if(!(confirm('Are you sure to delete'))) return false">Delete</a>
                </td>
            
            </tr>
            
        </c:forEach>
             
          </table>
        <a href="new">Create New Account</a>
    </body>
</html>
