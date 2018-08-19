<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="article" items="${articles}">
<ul><li>
<div>

<a href='${article.get("url")}' target="_blank">
 <b> ${article.get("title")}</b>
  <br>
    ${article.byline} <br> Dated:${article.published_date}
  </a>
  </div>
  </li>
  </ul>
   <br><br>
</c:forEach>




</body>
</html>