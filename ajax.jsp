<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<div id="example">
		<button class="switch">Click me</button>
	</div>
	<div id="result"></div>
	<script>
		$(document).ready(function(){
			$('#example').on('click','button.switch',function(){
				$.ajax('Testing.jsp')
					.done(function(response){
						$('#result').html(response);
					});
			});
		});
	</script></body>
</html>