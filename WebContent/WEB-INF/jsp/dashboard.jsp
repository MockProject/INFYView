<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <!-- <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags!! -->
    <title>INFYView Dashboard</title>

    <!-- Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	<script type='text/javascript' src='//code.jquery.com/jquery-1.11.3.js'></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!--Logo-->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mainNavBar">
					<span class="glyphicon glyphicon glyphicon-menu-hamburger" style="color:white"></span>
					<!--<span class="icon-bar"></span>-->
				</button>
				<a href="#" class="navbar-brand">INFYView</a>
			</div>
			<!--Menu Items-->
			<div class="collapse navbar-collapse" id="mainNavBar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#home" data-toggle="tab">Home</a></li>
					<li><a href="#profile" data-toggle="tab">Geo Search</a></li>
					<li><a href="#" data-toggle="tab">Unit Share</a></li>
					<li><a href="#" data-toggle="tab">Attrition</a></li>
					<li><a href="#" data-toggle="tab">Reports</a></li>
					<li><a href="#" data-toggle="tab">Settings</a></li>
				</ul>
				<!--Right Align Logout-->
				<ul class="nav navbar-nav navbar-right">
					<li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
				</ul>
			</div>
		</div>
		
		<div id="myTabContent" class="tab-content">
			<div class="tab-pane fade active in" id="home">
				<jsp:include page="/WEB-INF/jsp/hometab.jsp"></jsp:include>
			</div>
			<div class="tab-pane fade " id="profile">
				<jsp:include page="/WEB-INF/jsp/piechart.jsp"></jsp:include>
			</div>
		</div>
	</nav>
  </body>
</html>
