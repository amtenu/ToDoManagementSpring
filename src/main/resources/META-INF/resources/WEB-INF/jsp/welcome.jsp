

<html>

<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">

<title>Welcome</title>
<body>
	<nav class="navbar navbar-expand-md  navbar-light bg-light mb-3 p-1">
		<a class="navbar-brand m-1" href="/">myDoDos</a>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
		</ul>
	</nav>

	<h1>Welcome ${name}</h1>


	<div>
		<a href="list-todos">Manage</a>your todos
	</div>



</body>

</html>