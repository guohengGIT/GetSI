<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>get Memory Information</title>
</head>
<body>
<div style="width:99%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:left;padding-top:13px;padding-left:23px;padding-right:10px;font-size:25px;margin-top:-10px;margin-left:-10px;">Memory Information</div><br><br>
<center>
	<h3>Memory Detail Information</h3><br>
	<form action="getMemoryServlet" method="post">
		<table border="1" style="background-color:#F4F3F6">
			<tr>
				<th height="35px">Memory Total</th>
				<th height="35px">Memory Used</th>
				<th height="35px">Memory Free</th>
				<th height="35px">Exchange Area Total</th>
				<th height="35px">Exchange Area Used</th>
				<th height="35px">Exchange Area Free</th>
			</tr>
			<tr>
				<td height="35px"><c:out value="${memory.memoryTotal} (/K)"/></td>
				<td height="35px"><c:out value="${memory.memoryUsed} (/K)"/></td>
				<td height="35px"><c:out value="${memory.memoryFree} (/K)"/></td>
				<td height="35px"><c:out value="${memory.exchange_area_total} (/K)"/></td>
				<td height="35px"><c:out value="${memory.exchange_area_used} (/K)"/></td>
				<td height="35px"><c:out value="${memory.exchange_area_free} (/K)"/></td>
			</tr>
		</table><br> <br>
		<input type="submit" value="refresh" style='font-size:20px'/>&nbsp;
		<input type="button" value="back" style='font-size:20px' onclick="javascrtpt:window.location='index.jsp'"/>
	</form>
</center>	
<div id="txt" style="width:100%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:center;padding-top:13px;padding-right:17px;font-size:25px;float:left;margin-left:-10px;margin-top:325px;">HPE Helion Stackato-Hacakthon</div>
</body>
</html>