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

	LOCAL_HOST=<%=java.net.InetAddress.getLocalHost().getHostName()%><br>
	PATH=<%= request.getPathInfo()%><BR>
	QUERY_STRING=<%= request.getQueryString()%><BR>
	REMOTE_ADDR=<%= request.getRemoteAddr()%><BR>
	SERVER_PORT=<%= request.getServerPort()%><BR>
	REMOTE_USER=<%= request.getRemoteUser()%><BR>
	REQUEST_METHOD=<%= request.getMethod()%><BR>
	REQUEST_URI=<%= request.getRequestURI()%><BR>
	SERVER_NAME=<%= request.getServerName()%><BR>
	<%--  Expire=<%= request.getCookies()[1].getMaxAge()%><BR> -->
	<%--   
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