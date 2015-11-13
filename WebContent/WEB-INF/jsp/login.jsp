<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>INFYView Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Sabyasachi">

        <!-- CSS -->
        <link rel="stylesheet" href="<c:url value="http://fonts.googleapis.com/css?family=PT+Sans:400,700"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/reset.css"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/supersized.css"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/loginstyle.css"/>">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>INFYView</h1>
            <form:form action="login" method="post">
                <form:input type="text" path="username" class="username" placeholder="Username"/>
                <form:input type="password" path="password" class="password" placeholder="Password"/>
                <button type="submit">Login</button>
                <div class="error"><span>${errmessage}</span></div>
            </form:form>
            <div class="connect">
                <p>or connect with:</p>
                <p>
                    <a class="facebook" href=""></a>
                    <a class="twitter" href=""></a>
                </p>
            </div>
        </div>

        <!-- Javascript -->
        <script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.2/jquery.min.js"/>"></script>
        <script src="<c:url value="/resource_bundle/js/supersized.3.2.7.min.js"/>"></script>
        <script src="<c:url value="/resource_bundle/js/supersized-init.js"/>"></script>
        <script src="<c:url value="/resource_bundle/js/scripts.js"/>"></script>

    </body>

</html>
