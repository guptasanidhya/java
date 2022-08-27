<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="authorcss.css" type="text/css" >
<title>authors</title>

</head>
<body>
<div class="jspclass">
<h3 style="color:blue;background-color:yellow;">choose an author:</h3>
<form method="get">
<input type="checkbox" name="author" value="Sanidhya">sanidhya
<input type="checkbox" name="author" value="nitin">nitin
<input type="checkbox" name="author" value="mohini">mohini
<input type="submit" value="query">
</form>

<%
String[] authors = request.getParameterValues("author"); 
if (authors!=null){
%>
<h3>you have selected author(s):</h3>
<ul>
<%
for (int i=0;i<authors.length;++i){
%>
<li><%= authors[i] %></li>
 <%
      }
  %>
    </ul>
    <a href="<%= request.getRequestURI() %>">BACK</a>
  <%
  }
  %>
</div>
</body>
</html>