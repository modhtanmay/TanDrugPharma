<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
<meta charset="ISO-8859-1">
<title>Expired Medicines</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-warning">
  <a style="font-weight: bold;" class="navbar-brand" href="/">TanDrugPharma</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="display">Medicines <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link active" href="load">Add</a>
      <a class="btn btn-outline-light" class="nav-item nav-link active" href="expired">Expired</a>      
    </div>
  </div>
</nav>
<body style="background-color: #f1f3de">
<h1 style="margin-top:50px; font-style:inherit; font-family:fantasy;" align="center">Expired Medicines</h1>
<div align="center">
	<table style="width:90%; margin-top: 20px " class="table table-dark" border="1" cellpadding="2" cellspacing="2">
		<thead>
			<tr align="center">
				<th>Medicine Id</th>
				<th>Medicine Name</th>
				<th>Medicine Purpose</th>
				<th>Price</th>
				<th>Stock</th>
				<th>Manufacturing Date</th>
				<th>Expiry Date</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>	
			<c:forEach var="m" items="${medicineExpired}">
				<tr align="center">
					<td>${m.medId}</td>
					<td>${m.medName}</td>
					<td>${m.medType}</td>
					<td>${m.medPrice}</td>
					<td>${m.medStock}</td>
					<td><fmt:formatDate value="${m.medManDate}" pattern="dd - MMM - yyyy"/></td>
					<td><fmt:formatDate value="${m.medExpDate}" pattern="dd - MMM - yyyy"/></td>
					<td><a class="btn btn-outline-warning" href="deleteExp/${m.medId}" onclick="return confirm('Are you sure you want to Delete?');">Delete</a> </td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>