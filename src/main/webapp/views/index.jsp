<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>User Details<h1>
    <form action="saveuser" method="POST">
        <table>
            <tr>
                <td>User id</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
               <td>User name</td>
               <td><input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>User phone</td>
                <td><input type="text" name="uphn"></td>
            </tr>
            <tr>
                 <td></td>
                 <td><input type="submit" value="Save User"></td>
            </tr>
        </table>
    </form>
</body>
</html>