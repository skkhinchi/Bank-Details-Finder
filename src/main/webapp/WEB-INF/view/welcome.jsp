<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Welcome</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
	<style>
		table {
			font-family: arial, sans-serif;
			border-collapse: collapse;
			width: 100%;
		}

		td, th {
			border: 1px solid #dddddd;
			text-align: left;
			padding: 8px;
		}

		tr:nth-child(even) {
			background-color: #dddddd;
		}
	</style>
<body bgcolor="blue">

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">

					<li><a href="/welcome">Find By IFSC</a></li>
					<li><a href="/welcome">Find By Bank Name</a></li>
					<li><a href="/welcome">Find By City</a></li>

				</ul>
			</div>
		</div>
	</div>
	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome</h1>
			<h2>To</h2>
			<h3>Bank Details Finder</h3>
		</div>
	</div>
	<div class="container text-center">
		<h3>Find Bank Details</h3>
		<hr>

		<div class="form-group">
			<label class="control-label col-md-3">IFSC CODE</label>
			<div class="col-md-7">
				<input id="ifsc-code" type="text" class="form-control" name="id"
					value="${branch.ifsc}" />
			</div>
		</div>
		<div class="form-group">

			<div class="col-md-7"></div>
		</div>
		<div class="form-group ">
			<input type="submit" onclick="getBankDetails()" class="btn btn-primary" value="Find" />
		</div>
	</div>
	<div id="result">
	
	</div>
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script>
		function getBankDetails(){
			console.log("It works");
			var ifsc = document.getElementById("ifsc-code").value
			var url = "http://localhost:8080/show-bank?id="+ifsc
			fetch(url, {method: 'GET'})
				.then(res => res.json())
				.then(res => createTable(res));
		}
		
		function createTable(res){
			console.log(res);
			var html = '<table>'+
			  +'<tr>'
			  +  '<th>IFSC</th>'
			   + '<th>Bank Id</th>'
			    +'<th>Address</th>'
			    +'<th>Branch</th>'
			    +'<th>City</th>'
			    +'<th>District</th>'
			    +'<th>State</th>'
			  +'</tr>'
			  +'<tr>'
			    +'<td>'+res.ifsc+'</td>'
			    +'<td>'+res.bank_id+'</td>'
			    +'<td>'+res.address+'</td>'
			    +'<td>'+res.branch+'</td>'
			    +'<td>'+res.city+'</td>'
			    +'<td>'+res.district+'</td>'
			    +'<td>'+res.state+'</td>'
			  +'</tr>'
			+'</table>'
			
			document.getElementById("result").innerHTML = html;
		}
	</script>
</body>
</html>