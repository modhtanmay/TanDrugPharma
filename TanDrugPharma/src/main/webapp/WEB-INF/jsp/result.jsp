<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>TanDrugPharma</title>	
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<c:url value="/images/drug.jpeg" var="drug" />
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-info">
  	<a style="font-weight: bold;" class="navbar-brand" href="/">TanDrugPharma</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	   	<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		<div class="navbar-nav">
		  <a class="nav-item nav-link active" href="display">Medicines<span class="sr-only">(current)</span></a>
		  <a class="nav-item nav-link active" href="load">Add</a>
		  <a class="nav-item nav-link active" href="expired">Expired</a>
		  <a class="btn btn-outline-light" class=" nav-item nav-link active" href="summary">Summary</a>		  
		</div>
	</div>
</nav>
<body background="/images/drug.jpeg" style="background-size:cover; background-position: center;">
<div align="center" style="margin-left: 20%;">
<table style="width:50%; margin-top: 40px " class="table table-dark" border="1" cellpadding="2" cellspacing="2">
		<thead>	
			<tr align="center">
				<th>Medicine Id</th>
				<th>Medicine Name</th>
				<th>Price</th>
				<th>Medicine Stock</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="m" items="${medDet}">
				<tr align="center">
					<td>${m.medId}</td>
					<td>${m.medName}</td>
					<td>${m.medPrice}</td>
					<td>${m.medStock}</td>
				</tr>
			</c:forEach>
			<tr align="center">
				<td>-</td>
				<td>-</td>
				<td>${sumPrice} /-</td>
				<td>${sumStock} Blocks</td>
			</tr>
		</tbody>
	</table>
<p style="font-family: inherit; font-size: 20px; font-weight: 900;">Total Manufactured Amount: ${amount} /-</p>
</div>
</html>