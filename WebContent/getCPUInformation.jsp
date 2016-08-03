<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>get CPU information</title>
</head>
<body bgcolor="#FFFFFF">
<div style="width:99%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:left;padding-top:13px;padding-left:23px;padding-right:10px;font-size:25px;margin-top:-10px;margin-left:-10px;">CPU Information</div>
<center>
	<%-- <c:forEach ></c:forEach> --%>

	<h3>CPU Detail Information</h3><br>
	<form action="getCPUServlet" method="post">
	
		 
		<table border="1" style="background-color:#F4F3F6">
			<tr>
				<th width="80px" height="35px">CPU Total</th>
				<th width="100px" height="35px">CPU Producer</th>
				<th width="250px" height="35px">CPU Model</th>
				<th width="50px" height="35px">CPU CacheSize</th>
				<th width="50px" height="35px">User usage</th>
				<th width="50px" height="35px">System usage</th>
				<th width="50px" height="35px">Current waiting rate</th>
				<th width="50px" height="35px">Current error rate</th>
				<th width="50px" height="35px">Current idle rate</th>
				<th width="50px" height="35px">Overall usage</th>
			</tr>
			<c:forEach items="${requestScope.list }" var="list"> 
	        <tr>  
	            <td width="80px" height="35px">${list.cpuMHz}</td>  
	            <td width="100px" height="35px">${list.cpuVendor}</td>  
	            <td width="250px" height="35px">${list.cpuModel }</td>               
	            <td width="50px" height="35px">${list.cpuCacheSize }</td>               
	            <td width="50px" height="35px">${list.cpuUser }</td>               
	            <td width="50px" height="35px">${list.cpuSys }</td>               
	            <td width="50px" height="35px">${list.cpuWait }</td>               
	            <td width="50px" height="35px">${list.cpuNice }</td>               
	            <td width="50px" height="35px">${list.cpuIdle }</td>               
	            <td width="50px" height="35px">${list.cpuCombined }</td>               
	        </tr> 
	        </c:forEach>
	     </table> <br>
	     
    	<input type="submit" value="refresh" style='font-size:20px'/>&nbsp;
    	<input type="button" value="back" style='font-size:20px' onclick="javascrtpt:window.location='index.jsp'"/>
    </form>
</center>
<div id="txt" style="width:100%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:center;padding-top:13px;padding-right:17px;font-size:25px;float:left;margin-left:-10px;margin-top:245px;">HPE Helion Stackato-Hacakthon</div>
</body>
</html>