<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<style>

.node circle {
    cursor: pointer;
    stroke: #3182bd;
    stroke-width: 1.5px;
}
.node text {
    font: 10px sans-serif;
    pointer-events: none;
    text-anchor: middle;
}
line.link {
    fill: none;
    stroke: #9ecae1;
    stroke-width: 1.5px;
}

</style>

<script src="http://d3js.org/d3.v3.min.js"></script>
<script src="<c:url value="/resource_bundle/js/Force_Layout_Hardcoded.js"/>"></script>
<!-- <script type='text/javascript' src='//code.jquery.com/jquery-2.1.0.js'></script> -->
</head>
<body>
		<div id="viz" style="border:1px solid black"></div>
</body>
</html>