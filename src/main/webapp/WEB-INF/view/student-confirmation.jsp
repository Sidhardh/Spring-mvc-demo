<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<b> Student Confirmation</b>
<br>
<a href="../"> Main Menu</a>
<br/>

Student Name :  ${student.firstName} <br><br>
Student Last Name :  ${student.lastName} <br><br>

Student place  : ${student.place}<br><br>
Favorite Language : ${student.favoriteLanguage}

Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}"> 
<li>${temp }</li>

</c:forEach>
</ul>




</body>
</html>