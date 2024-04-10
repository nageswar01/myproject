<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>BOOKING</title>
<link rel="stylesheet" href="bookingconformation.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body style="background-image: url('./asset/906112.jpg');">

	<div class="b1">
		<nav class="navbar bg-body-tertiary">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src="./asset/163-1635561_picture-party-icon-png-transparent-png.png"
					alt="Logo" width="30" height="24"
					class="d-inline-block align-text-top"> CELEBRATIONS LAND
				</a>
			</div>
		</nav>
		<h1>
			<b><u>E=mc^2 </u><br>
			<h2>"Enjoyment=middle class celebrations"</b>
			</h2>
		</h1>

		<ul class="nav justify-content-center">
			<li class="nav-item"><a class="nav-link active"
				aria-current="page" href="home.html">HOME</a></li>
			<li class="nav-item"><a class="nav-link"
				href="https://www.eatsure.com/vijayawada-restaurants">FOOD</a></li>
			<li class="nav-item"><a class="nav-link"
				href="celebrations.html">CELEBRATIONS</a></li>
			<li class="nav-item"><a class="nav-link" href="booking.html">BOOKING</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="https://www.google.com/maps/dir/16.5117952,80.642048/Party+Land+RJY,+Tilak+Rd,+beside+Guntur+Oxford+School,+opposite+Lenskart,+Rajamahendravaram,+Andhra+Pradesh+533101/@16.7745802,80.5567038,9z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a37a305a2b21649:0x701aaa65a9f3ef38!2m2!1d81.7950545!2d17.0030571?entry=ttu">ADDRESS</a>
			</li>
		</ul>
	</div>
	<div class="r1">
		<h1>
			<b><u>BOOKING CONFORMATION</u></b>
		</h1>
	</div>
	<div class="n1">
		<form>
			<div class="z">
				<label><h5>
						<u>NAME</u>:-
					</h5></label>
				<h1><%=request.getAttribute("name")%></h1>
				<label><h5>
						<u>OCCASION</u>:-
					</h5></label>
				<h1><%=request.getAttribute("occasion")%></h1>
				<label><h5>
						
						<u>DATE</u>:-
					</h5></label>
				<h1><%=request.getAttribute("date")%></h1>
				<label><h5>
				<u>HOURS</u>:-
					</h5></label>
				<h1><%=request.getAttribute("hours")%></h1>
				<label><h5>
						<u>PHONE NUMBER</u>:-
					</h5></label>
				<h1><%=request.getAttribute("phone")%></h1>
			</div>
			<div class="x">
				<button class="v1">
					<u>Totalbill</u>:-<%=request.getAttribute("Totalbill")%></button>
				<br>
				<br>
				<h3>THANK YOU</h3>
			</div>
		</form>
		>
	</div>

	<footer class="footer">
		<div class="container text-center">
			<div class="row">
				<div class="col">
					<h3>customer support</h3>
					<hr>
					<ul>
						<a href="">FAQS</a>
						<br>
						<a href="">Terms & conditions</a>
						<br>
						<a href="">Privacy policy</a>
						<br>
					</ul>
				</div>
				<div class="col">
					<h3>Contact us</h3>
					<hr>
					<p>email:naninageswar321@gmail.com</p>
					<p>phone:9949940588</p>
					<p>Rajahmundry,East godavari dst,AP</p>
				</div>
				<div class="col">
					<h3>Connect With Us</h3>
					<hr>
					<ul class="social-icons">
						<a href="#" target="_blank">Facebook</a>
						<br>
						<a href="#" target="_blank">Twitter</a>
						<br>
						<a href="#" target="_blank">LinkedIn</a>
						<br>
						<a href="#" target="_blank">Instagram</a>
						<br>
					</ul>
				</div>
			</div>
		</div>
		<hr>
		<p class="footer2">@nageswar2002,All Rights are Reserved</p>
	</footer>
</body>
</html>