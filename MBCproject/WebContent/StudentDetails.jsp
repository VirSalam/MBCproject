<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mama Mia Here I go again</title>
</head>
<body>
	<center><h3>WELCOME TO OUR CLASS</h3></center>
	<center><%= request.getAttribute("al") %></center><br>

	<center><TABLE bgcolor="grey" border="1">
		<TR bgcolor="yellow" align="center">
			<TH width="100">Sunday</TH>
			<TH width="100">Monday</TH>
			<TH width="100">Tuesday</TH>
			<TH width="100">Wednesday</TH>
			<TH width="100">Thursday</TH>
			<TH width="100">Friday</TH>
			<TH width="100">Saturday</TH>			
		</TR>
		
		<TR align="center">
			<td>Closed</td>
			<td>9-5</td>
			<td>9-5</td>
			<td>9-5</td>
			<td>9-5</td>
			<td>9-5</td>
			<td>9-5</td>	
		</TR>
	</TABLE></center><br>
		
		<center><table>
			<TR align="center">
				<th>ID</th>
				<th>Name</th>
				<th>Sex</th>
			</TR>
			<TR align="center">
			<c:forEach var="items" items="al">				
				${items.getid()}
				${items.getName()}
				${items.getSex()}
				</c:forEach>
				</TR>			
		</center></table>
		
		<form action="logout"><center>
		<input type="submit" value ="Log Out"></center>
		</form>	
		
						
</body>
</html>
					
