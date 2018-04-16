
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
    </head>
    <body>
        <h1>Enter Banking Details :</h1>
        <form:form action="saveAccount" modelAttribute="account">
            <table>
                <tr>
                    <td><spring:message text="Account No."/></td>
                    <td><form:input path="accountNumber"/></td>
                </tr>
                
                <tr>
                    <td><spring:message text="Account Holder Name"/></td>
                    <td><form:input path="accountHolderName"/></td>
                </tr>
                
                <tr>
                    <td><spring:message text="Account Balance"/></td>
                    <td><form:input path="balance"/></td>
                </tr>
                
                
                
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save" name="submit" />
                    </td>  
                </tr>
            </table>
            
        </form:form>
    </body>
</html>
