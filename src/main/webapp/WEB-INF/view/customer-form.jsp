<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3>Customer Form</h3>
	<form:form action="validateCustomer" modelAttribute="customer">
First Name      : <form:input path="firstName" />
		<br>
		<br>
Last  Name (*)  : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
Free Pass 		: <form:input path="freePasses" />
		<br>
		<br>
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		<br>
					
Postal Code		: <form:input path="postalCode" />
		<br>
		<br>
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
Course Code		: <form:input path="coursecode" />
		<br>
		<br>
		<form:errors path="coursecode" cssClass="error"></form:errors>
		<br>
		<br>



		<input type="submit" value="Validate and Submit" />
	</form:form>



</body>
</html>