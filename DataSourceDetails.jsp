<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DataSource Configured</title>

<!-- CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-theme.css" rel="stylesheet">
<link href="resources/css/dataTable.bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/magnific-popup.css" rel="stylesheet">
<link href="resources/css/dashboard.css" rel="stylesheet">

<!-- Javascripts -->
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/script.js"></script>
<script src="resources/js/jquery.dataTable.min.js"></script>
<script src="resources/js/dataTable.bootstrap.min.js"></script>
<script src="resources/js/jquery1.jquery.min.js"></script>
<script src="resources/js/multifilter.min.js"></script>
<script src="resources/js/clipboard.min.js"></script>
<script src="resources/js/jquery.magnific-popup.min.js"></script>

</head>
<body>
	<!-- start of header -->
	<div class="main-wrapper">
		<!-- Begin page content -->
		<div class="container top-navigation">
			<div class="col-md-10 col-xs-5">
				<a href="#"><img src="resources/images/equifax-logo.png"
					class="img-responsive"></a>
			</div>
		</div>
		<nav class="navbar navbar-default navbar-static-top main-nav">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
		</div>
		</nav>
		<div class="col-md-12 call-to-act">
			<div class="container">
				<a href="#"><img src="resources/images/datoz-logo.png"></a>
			</div>
		</div>
		<!--End  of header -->
		<div class="container">
			<div class="container main-wrap">
				<div class="container form-scenario">
					<fieldset>
						<!-- Form Name -->
						<legend>Data Sources configured</legend>
						<div class="col-md-12">
							<div class="col-md-12 table-main">
								<div class="table-responsive">
									<table
										class="table table-bordered table-hover table-striped cust-table">
										<thead>
											<tr>
												<th>Name</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${datasources}" var="datasource">
												<tr>
													<td><ul>
															<li>${datasource}</li>
														</ul></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</fieldset>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="Footer.jsp"%>
</body>
</html>