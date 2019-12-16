<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Welcome to Creative Shopping</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<body bgcolor="blue">

<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome  " class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				
					<li><a href="">Find By IFSC</a></li>
					<li><a href="">Find By Bank Name</a></li>
					<li><a href="">Find By City</a></li>
				</ul>
			</div>
		</div>
	</div>
	
		
		
	<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome </h1>
					<h3>Good Morning</h3>
				</div>
			</div>
			
			
			
			<c:choose>  
	
	<c:when test="${mode=='BANK_DATA'}">
			<div class="container text-center" id="tasksDiv">
				<h3>Bank Details</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>IFSC</th>
								<th>BANK ID</th>
								<th>BRANCH</th>
								<th>ADDRESS</th>
								<th>CITY</th>
								<th>DISTRICT</th>
								<th>STATE</th>
								
							</tr>
						</thead>
						<tbody>
								<c:forEach var="branches" items="${branches}">
								<tr>
									<td>${branches.ifsc}</td>
									<td>${branches.bank_id}</td>
									<td>${branches.branch}</td>
									<td>${branches.address}</td>
									<td>${branches.city}</td>
									<td>${branches.states}</td>
								</tr>
								</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
			
			</c:when>
			</c:choose>
			
			
			
			

	
	
	
<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>