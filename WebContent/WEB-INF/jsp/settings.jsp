<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>InfyView - Settings</title>
	
	<!-- Bootstrap Scripts and stylesheets -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</head>
<body>

<sec:authentication property="principal.username" var="loggedInUser"/>

	<div class="container">
  		<h2>Select Settings</h2>
  		
  		<form:form method="POST" commandName="SettingsForm">
    		<div class="form-group">
      			<div style="display:${'DM'!=loggedInUser?'none':''}">
      				<label for="dcLevel">DC level Details:</label>
      				<form:select path="dcValue" class="form-control" id="dcLevel">
        				<form:option value="NONE" label="--- Select ---" />
        				<form:options items="${dcList}" />
     		 		</form:select>
      				<br/>
      				<label for="duLevel">DU level Details:</label>
      				<form:select path="duValue" class="form-control" id="duLevel">
        				<form:option value="NONE" label="--- Select ---" />
						<form:options items="${duList}" />
      				</form:select>
      			</div>
      			<div style="display:${'UnitHead'!=loggedInUser?'none':''}">
      				<label for="unitLevel">Unit level Details:</label>
      				<form:select path="unitValue" class="form-control" id="unitLevel">
        				<form:option value="NONE" label="--- Select ---" />
						<form:options items="${unitList}" />
      				</form:select>
      			</div>
    		</div>
    		<button type="submit" class="btn btn-info" >Go to Dashboard</button>
  		</form:form>
	</div>

	
</body>
</html>