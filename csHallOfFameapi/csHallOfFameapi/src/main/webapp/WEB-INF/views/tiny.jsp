<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body class="w3-content" style="max-width:1300px">
</head>
<title>tiny-list</title>

<div class="w3-row">
  <div class="w3-half w3-black w3-container w3-center" style="height:800px">
    <div class="w3-padding-64">
      <h1>Computer Science Hall of Fame</h1>
    </div>
    <div class="w3-padding-64">
      <a href="/" class="w3-button w3-black w3-block w3-hover-blue-grey w3-padding-16">Home</a>
      <a href="/tiny" class="w3-button w3-black w3-block w3-hover-teal w3-padding-16">Get Tiny</a>
      <a href="/complete" class="w3-button w3-black w3-block w3-hover-dark-grey w3-padding-16">Get Complete</a>
    </div>
  </div>
  <div class="w3-half w3-blue-grey w3-container" style="height:800px">
  	 <div class="w3-padding-64 w3-center">
  		<img src="/images/simeon.jpg" class="w3-margin w3-circle" alt="Person" style="width:40%">
  	</div>
    <table class="table table-sm">
    	<thead>
    		<tr>
    			<th scope="col">Name</th>
    			<th scope="col">Invention</th>
    			<th scope="col">Date</th>
    		</tr>
    	</thead>
    		<c:forEach var="person" items="${list}">
    			<tr>
    				<td>${ person.name }</td><td>${ person.invented }</td><td>${ person.year }</td>
    			</tr>
			</c:forEach>
    </table>
  </div>
</div>

</html>