<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>TanDrugPharma</title>
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<c:url value="/images/drug.jpeg" var="drug" />
</head>
<h1 align="center" style="margin-top: 20px; font-style:inherit; font-weight:bold; font-family:inherit;">TanDrug Pharmaceuticals </h1>
<body background="/images/drug.jpeg" style="background-size: cover; background-position: center;">
<div align="center" style="margin: 20%">
	<a class="btn btn-success" href="load"><h4>Add Medicine</h4></a>
	<a class="btn btn-dark" href="display"><h4>Show Stock</h4></a>
</div>
</html>