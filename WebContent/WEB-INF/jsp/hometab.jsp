<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="<c:url value="/resource_bundle/css/hometabstyle.css"/>">
</head>
<body>

	
  <div class="bs-example">
    <div class="btn-group btn-group-justified">
        <a href="#" class="btn btn-danger btn-xl responsive-width" 
        	data-toggle="modal" data-target="#modalValueBench"><b>Employees on Bench:<br/>${banchPercentVal}%</b></a>
        <a href="#" class="btn btn-warning btn-xl responsive-width"
        	data-toggle="modal" data-target="#modalValueBuffer"><b>Employees on Buffer:<br/>${bufferPercentVal}%</b></a>
        <a href="#" class="btn btn-success btn-xl responsive-width"
        	data-toggle="modal" data-target="#modalValueProd"><b>Employees on Production:<br/>${prodPercentVal}%</b></a>
    </div>
  </div>
  <div id="wrapper_div">
    <div id="left"><jsp:include page="/WEB-INF/jsp/geochart.jsp"/></div>
    <div id="right"><jsp:include page="/WEB-INF/jsp/force_graph.jsp"></jsp:include></div>
 </div>
 <!-- Modal -->
  <div class="modal fade" id="modalValueBench" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">ROLE WISE SPLIT OF EMPLOYEES ON BENCH</h4>
        </div>
        <div class="modal-body">
          <%-- <jsp:include page="/WEB-INF/jsp/piechart.jsp"> --%>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <div class="modal fade" id="modalValueBuffer" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">ROLE WISE SPLIT OF EMPLOYEES ON BUFFER</h4>
        </div>
        <div class="modal-body">
          <%-- <jsp:include page="/WEB-INF/jsp/piechart.jsp"> --%>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <div class="modal fade" id="modalValueProd" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">ROLE WISE SPLIT OF EMPLOYEES ON PRODUCTION</h4>
        </div>
        <div class="modal-body">
          <%-- <jsp:include page="/WEB-INF/jsp/piechart.jsp"> --%>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-info" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
 

  
</body>
</html>