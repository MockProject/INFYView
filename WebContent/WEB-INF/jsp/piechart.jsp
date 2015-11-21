<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>
	<script src="https://code.highcharts.com/highcharts-3d.js"></script>	
	<script src="<c:url value="/resource_bundle/js/piechart.js"/>"></script>
	<script src="<c:url value="/resource_bundle/js/piecharts_theme_Sand_Signica.js"/>"></script>
</head>
<body>
	<input id ="pieHiddenData" type="hidden" value="${pieChartData}"/>	
	<div id="pie_container" align="center" style="height: 400px"></div>
</body>
</html>