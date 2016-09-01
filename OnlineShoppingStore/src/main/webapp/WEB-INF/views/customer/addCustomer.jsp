<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	 <!-- Navigation -->
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="#page-top">Online Shopping Store</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a href="#about">About</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="img/profile.png" alt="">
                    <
                </div>
            </div>
        </div>
    </header>
    <br/>



<div class="well" style="width: 60%;margin: auto">
		<h2>Customer Registration</h2>
		<form:form modelAttribute="customer"
			action="/OnlineShoppingStore/spring/customer/add">
			<br/>
			<h3>Personal Info</h3>
			 <form:errors path="*" cssClass="alert alert-danger" element="div"/>
			<div class="row">
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">First Name</span>
						<form:input path="firstName" class="form-control" />
					</div>
				</div>
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Last Name</span>
						<form:input path="lastName" class="form-control" />
					</div>
				</div>
				
			</div>
			<br/>
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Email</span>
						<form:input path="email" class="form-control" />
					</div>
				</div>
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Password</span>
						<form:input type="password" path="password" class="form-control" />
					</div>
				</div>
				
			</div>
			<br/>
			<br/>
	       <h3>Address Information</h3>
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Street</span>
						<form:input path="address.street" class="form-control" />
					</div>
				</div>
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">City</span>
						<form:input path="address.city" class="form-control" />
					</div>
				</div>
				
			</div>
			<br />
	       
			<div class="row">
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">Zip</span>
						<form:input path="address.zip" class="form-control" />
					</div>
				</div>
				
				
				<div class="col-md-4">
					<div class="input-group">
						<span class="input-group-addon" id="basic-addon1">State</span>
						<form:input path="address.state" class="form-control" />
					</div>
				</div>
				
			</div>
			<br />
			<div>
				<input type="submit" value="Add Customer" class="btn btn-primary" />
				<input type="reset" value="Reset" class="btn btn-reset" />
			</div>
			
			<br/>
			<br/>
					
		</form:form>
	</div>
</body>
</html>