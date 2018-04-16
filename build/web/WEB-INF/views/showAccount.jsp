<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Details : Sulabh Banking App</title>
    </head>
    <body>
        <h1>Account Details :</h1>
        <table>
                <tr>
                    <td><spring:message text="Account No."/></td>
                    <td>${account.accountNumber}</td>
                </tr>
                
                <tr>
                    <td><spring:message text="Account Holder Name"/></td>
                    <td>${account.accountHolderName}</td>
                </tr>
                
                <tr>
                    <td><spring:message text="Account Balance"/></td>
                    <td>${account.balance}</td>
                </tr>
        
    </body>
</html>
