<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Request Variables</title>
<LINK REL=STYLESHEET
      HREF="/sis/css/sis.css"
	  TYPE="text/css">
</head>
<body>
	   
    <% 
    for (Enumeration head= request.getHeaderNames();head.hasMoreElements();) {
   	String key =(String)head.nextElement(); %>
	<%=key%>=<%=request.getHeader(key)%> <br>
    <%}%>
   
    HHHHHHHHHHHHHHHHH
	<br> 
	<% 
   		for (Enumeration attr= request.getAttributeNames();attr.hasMoreElements();) {
   		String key =(String)attr.nextElement(); %>
	<%= key%>=<%=request.getAttribute(key) %> <br>
   	<%}%>
	--%>
</body>
</html>