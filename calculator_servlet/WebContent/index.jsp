<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calculate" method="get">
  First Number:   <input type="text" name ="num1" placeholder="Enter a no"><br>
  Second Number:  <input type="text" name ="num2" placeholder="Enter another no"><br>
  Select The Operation: <br>
    <input type="radio" name ="operation" value="add">Addition
    <input type="radio" name ="operation" value="sub">Subtract
    <input type="radio" name ="operation" value="multi">Multiply
    <input type="radio" name ="operation" value="div">Division<br><br>
  
  
 <input type="submit" value="Calculate"></button>
   
    
  </form>  
</body>
</html>