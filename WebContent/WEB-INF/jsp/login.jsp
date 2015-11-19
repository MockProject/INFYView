<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>
        <title>INFYView Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Sabyasachi">

        <!-- CSS -->
        <link rel="stylesheet" href="<c:url value="http://fonts.googleapis.com/css?family=PT+Sans:400,700"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/reset.css"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/supersized.css"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/loginstyle.css"/>">
        <link rel="stylesheet" href="<c:url value="/resource_bundle/css/global_message_style.css"/>">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>
		<c:url value="/j_spring_security_check" var="secure_url"/>
        <div class="page-container">
            <h1>INFYView</h1>
            <form:form action="${secure_url}" method="POST" class="form_style">
                <form:input type="text" path="username" name="username" class="username form_input_style" placeholder="Username"/>
                <form:input type="password" path="password" name="password" class="password form_input_style" placeholder="Password"/>
                <button type="submit">Login</button> 
            </form:form>
            <%-- <form name='loginForm'
		  action="<c:url value='j_spring_security_check' />" method='POST'>

		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form> --%>
            <c:if test="${not empty errmessage}">
            	<div class="my-notify-error">${errmessage}</div>
            </c:if>
            <c:if test="${not empty successmessage}">
            	<div class="my-notify-success">${successmessage}</div>
            </c:if>
            <c:if test="${not empty infomessage}">
            	<div class="my-notify-info">${infomessage}</div>
            </c:if>
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
