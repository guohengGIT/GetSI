<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>get File information</title>
</head>
<body bgcolor="#FFFFFF">
<div style="width:99%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:left;padding-top:13px;padding-left:23px;padding-right:10px;font-size:25px;margin-top:-10px;margin-left:-10px;">File Information</div>
<center>
	<%-- <c:forEach ></c:forEach> --%>
	<h3>File Detail Information</h3><br>
	<form action="getFileServlet" method="post">
	
		 
		<table border="1" style="background-color:#F4F3F6">
			<tr>
				<th width="70px" height="35px">Dev Name</th>
				<th width="70px" height="35px">Dev Flag</th>
				<th width="150px" height="35px">Dev SysType Name</th>
				<th width="50px" height="35px">Dev Type</th>
				<th width="50px" height="35px">Total Space</th>
				<th width="50px" height="35px">Free Space</th>
				<th width="50px" height="35px">Used Space</th>
				<th width="50px" height="35px">Use Percent</th>
			</tr>
			<c:forEach items="${requestScope.list }" var="list"> 
	        <tr>  
	            <td width="70px" height="35px">${list.devName}</td>  
	            <td width="70px" height="35px">${list.devFlag}</td>  
	            <td width="150px" height="35px">${list.devSysTypeName }</td>               
	            <td width="50px" height="35px">${list.devType }</td>               
	            <td width="50px" height="35px">${list.devTotalSpace}(K)</td>               
	            <td width="50px" height="35px">${list.devFreeSpace}(k)</td>               
	            <td width="50px" height="35px">${list.vevUsedSpace}(K)</td>               
	            <td width="50px" height="35px">${list.devUsePercent}%</td>               
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