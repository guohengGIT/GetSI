<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>index</title>
<style type="text/css">

</style>
</head>
<body>
<div style="width:99%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:left;padding-top:13px;padding-left:23px;padding-right:10px;font-size:25px;margin-top:-10px;margin-left:-10px;">ALL Computer Information</div><br><br>
<h2 align="center" style="font-style:;color:">This is a about the application of computer information</h2><br>
<h3 align="center" style="font-style:italic;color:">Welcome :<%= request.getHeader("x-authenticated-user-username") %> </h3><br>
	<table border="1" align="center">
		<tr>
			<td>
				<form action="getMemoryServlet" method="post">
    				<input type="submit" style="width:320px;height:40px;" value="getMemoryInformation"  value="getMemoryInformation" />
    			</form >
			</td>
		</tr>
		<tr>
			<td>
				<form action="getCPUServlet" method="post">
    				<input type="submit" style="width:320px;height:40px;" value="getCPUInformation" value="getCPUInformation" />
    			</form >
			</td>
		</tr>
    	<tr>
			<td>
				<form action="getComputerServlet" method="post">
    				<input type="submit" style="width:320px;height:40px;" value="getComputerInformation" value="getComputerInformation" />
    			</form >
			</td>
		</tr>
		<tr>
			<td>
				<form action="getFileServlet" method="post">
    				<input type="submit" style="width:320px;height:40px;" value="getFileInformation" value="getFileInformation" />
    			</form >
			</td>
		</tr>
		<tr>
			<td>
				<form action="getOSServlet" method="post">
    				<input type="submit" style="width:320px;height:40px;" value="getOSInformation" value="getFileInformation" />
    			</form >
			</td>
		</tr>
    </table>
    
<div id="txt" style="width:100%; height:45px; border: 1px solid #000000;background:#000000;border-radius:0.5em;color:#DEE6CE; text-align:center;padding-top:13px;padding-right:17px;font-size:25px;margin-bottom：700px;float:left;margin-left:-10px;margin-top:166px;">HPE Helion Stackato-Hacakthon</div>

</body>
</html>