<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<body>
<b> Student Reg. Form</b>
<br/>
<br>
<form:form modelAttribute="student" action="studentForm">
First Name : <form:input path="firstName"/>
<br>
<br>
Last Name  : <form:input path="lastName"/>
<br>
<br>
Place  : <form:select path="place">
			<form:options items= "${theCountryOptions}" />
		</form:select>
<br><br>

Favorite language <br>

<form:radiobuttons path="favoriteLanguage"  items="${student.favoriteLangOptions}"/>
<%-- Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/> --%>
<br>
<br>

Operating Systems<br>

Windows<form:checkbox path="operatingSystems" value="Windows"/>
Mac OS<form:checkbox path="operatingSystems" value="Mac"/>
Linux <form:checkbox path="operatingSystems" value="Linux"/>

<br>
<br>
<input type="submit" value="Submit"> 
</form:form>



</body>
</html>