<!DOCTYPE html>
<html lang="en">
<head>
<title>Form</title>
</head>

<body>
	<h1>Registration Form</h1>

	<form action="form" method="post">
		<div>
			<label>Name:</label> <input type="text" name="name">
		</div>
		<br>
		<div>
			<label>UserName:</label> <input type="text" name="userName">
		</div>
		<br>
		<div>
			<label>Password:</label> <input type="password" name="password">
		</div>
		<br>
		<div>
			<label>E-mail:</label> <input type="email" name="email">
		</div>
		<br>

		<div>
			<label>Gender:</label> <input type="radio" name="gender"
				value="Male ">Male <input type="radio" name="gender"
				value="Female ">Female <input type="radio" name="gender"
				value="Other ">Other
		</div>

		<br>

		<div>
			<label>Hobbies:</label> <input type="checkbox" name="hobby"
				value="Reading ">Reading <input type="checkbox" name="hobby"
				value="Painting ">Painting <input type="checkbox"
				name="hobby" value="Cooking ">Cooking
		</div>

		<br>

		<div>
			<label>country:</label> <select name="country">
				<option value="cell">United States</option>
				<option value="pointer">India</option>
				<option value="default">Pakistan</option>
				<option value="text">Nepal</option>
				<option value="move">Brazil</option>
			</select>
		</div>
		<br>
		<div>
			<label>Phone-Number:</label> <input type="number" name="number">
		</div>
		<br>
		<button type="submit">Submit</button>
	</form>



</body>
</html>