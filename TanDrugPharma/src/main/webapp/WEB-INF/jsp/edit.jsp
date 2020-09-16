<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a style="font-weight: bold;" class="navbar-brand" href="/">TanDrugPharma</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="display">Medicines <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link active" href="load">Add</a>
      <a class="nav-item nav-link active" href="expired">Expired</a>
    </div>
  </div>
</nav>
<body style="background-color: #f1f3de">
<h1 style="margin-top:70px; font-style:inherit; font-family:fantasy;" align="center">Edit Medicine Entry</h1>
<div align="center" class="container" style="background-color: #e0ece4; max-width:900px; height:420p; padding: 5%">	
	<form:form method="post" modelAttribute="medicine" action="/editSave">
		<table style="width:100%">
			<tr>
				<td></td>
				<td><form:hidden path="medId" /></td>
			</tr>
			<tr style="display: flex;">
				<td style="flex: 8" class="h5 text-dark">Medicine Name :</td>
				<td style="flex: 7" class="h5 text-dark"><form:input class="form-control" path="medName" placeholder="Enter Medicine Name" /></td>
				<td style="flex: 8"><form:errors style="color:red" path = "medName" cssClass = "error" /></td>
			</tr>
			<tr style="display: flex;">
				<td style="flex: 8" class="h5 text-dark">Medicine Type :</td>
				<td style="flex: 7" class="h5 text-dark"><form:input pattern="[a-zA-Z ]+" class="form-control" path="medType" placeholder="Fever,Cold,Headache,..."/></td>
				<td style="flex: 8"><form:errors style="color:red" path = "medType" cssClass = "error" /></td>
			</tr>
			<tr style="display: flex;">
				<td style="flex: 8" class="h5 text-dark">Medicine Price :</td>
				<td style="flex: 7"><form:input type="number" pattern="^\d*(\.\d{0,2})?$" class="form-control" path="medPrice" placeholder="0.00" min="0" step="0.01" />
				<td style="flex: 8"><form:errors style="color:red" path = "medPrice" cssClass = "error" /></td>
			</tr>
			<tr style="display: flex; margin-top: 10px">
				<td style="flex: 8" class="h5 text-dark">Medicine Stock(In Block):</td>
				<td style="flex: 7"><form:input class="form-control" path="medStock" placeholder="Medicine Stock"/>
				<td style="flex: 8"><form:errors style="color:red" path = "medStock" cssClass = "error" /></td>
			</tr>
			<tr style="display: flex; margin-top: 10px">
				<td style="flex: 8" class="h5 text-dark">Manufacturing Date :</td>
				<td style="flex: 7"><form:input class="form-control" type="date" path="medManDate"/></td>
				<td style="flex: 8"><form:errors style="color:red" path = "medManDate" cssClass = "error" /></td>
			</tr>
			<tr style="display: flex; margin-top: 10px">
				<td style="flex: 8" class="h5 text-dark">Expiry Date :</td>
				<td style="flex: 7"><form:input class="form-control" type="date" path="medExpDate"/></td>
				<td style="flex: 8; color: red">${errorMsg}<form:errors style="color:red" path = "medExpDate" cssClass = "error" /></td>
			</tr>
			<tr>
				<td><input style="margin-top: 10px;margin-left: 265px" class="btn btn-warning" type="submit" value="Edit" onclick="return confirm('Are you sure you want to Submit Edit?');" /></td>
			</tr>
		</table>
	</form:form>
</div>	
</body>
</html>