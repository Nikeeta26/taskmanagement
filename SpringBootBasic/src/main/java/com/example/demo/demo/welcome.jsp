<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 80%;
  
  
  
}
tr:hover {
  background-color: blue;
}


td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<center>
<table border="1px" class="table table-md table-dark">
<tr style="background-color:pink;">

      <th scope="col">Id</th>
      <th scope="col">Task</th>
      <th scope="col">Discription</th> 
      <th scope="col">Action</th>   
</tr>
 
 <c:forEach var="e" items="${l1}">
 
<tr scope="row">
<td >${e.id}</td>
<td>${e.name}</td>
<td>${e.dis}</td>


<td>


<button type="submit"class="btn btn-dark "><a href="deletestud?id=${e.id}">Delete</a></button>


  <button type="submit"class="btn btn-primary "><a href="editstud?id=${e.id}">Edit</a></button>
               



                
</td>
</tr>

</c:forEach>
</table>
</center>
</body>
</html>