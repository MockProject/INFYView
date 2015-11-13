<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html> 
<html>
<head>

<!-- GoeChart Script-->
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/maps/modules/map.js"></script>
<script src="https://code.highcharts.com/maps/modules/data.js"></script>
<script src="https://code.highcharts.com/maps/modules/drilldown.js"></script>
<script src="http://code.highcharts.com/mapdata/custom/world.js"></script>
<script src="http://code.highcharts.com/maps/modules/exporting.js"></script>
<link href="https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
<script src="<c:url value="/resource_bundle/js/geochart_drilldown.js"/>"></script>
</head>
<body>
	<div id="geo_container" style="height: 505px; max-width: 800px; margin: 0 auto"></div>
</body>
</html>