<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is to bind form with Entity -->
<html>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
	rel="stylesheet">
<title>Add Todo Page</title>
</head>
<body>
<!-- creating navigation bar just to show -->
	<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
		<a class="navbar-brand m-1" href="https://courses.in28minutes.com">in28Minutes</a>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		<h1>Enter Todo Details</h1>
		<form:form method="post" modelAttribute="todo">
			<!-- form:form is something provided by JSTL due to above form Tag -->
			<!-- This is server side validation -- required="required" But This is something not much useful we also need server side validation-->
			<!--  	Description: <input type="text" name="description" required="required"/> -->
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				:
				<form:input type="text" path="description" />
				<!-- To show Errors occured on Page this is used -->
				<form:errors path="description" cssClass="text-warning"></form:errors>
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date</form:label>
				:
				<form:input type="date" path="targetDate" />
				<!-- To show Errors occured on Page this is used -->
				<form:errors path="targetDate" cssClass="text-warning"></form:errors>
			</fieldset>
			<input type="submit" class="btn btn-success" />

			<!-- This is for binding to Bean -->
			<form:input type="hidden" path="done" />
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="username" />


		</form:form>

	</div>
	<!-- Always check this path in Maven Dependencies there might be changes with versions -->
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
	<script
		src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

	<script src="webjars/jquery/3.7.0/dist/jquery.min.js"></script>

	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'yyyy-mm-dd'
		});
	</script>
</body>
</html>