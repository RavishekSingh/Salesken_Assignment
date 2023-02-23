<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
   
    h1{
        text-align: center;
        color: black;
        margin-top: 200px;
        font-size: 50px;
    }
  #links{
    width: 30%;
  
    border: 15px solid teal;
    padding: 20px;
    margin: auto;
    text-align: center;
    margin-top: 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  }
#links>a{
   
    
  text-decoration: none;
    margin: auto;
    margin-bottom: 10px;
    font-size: 22px;
    color: black;
}
#links>a:hover{
    background-color: rgb(117, 202, 202);
}

</style>
<body>

<h1> Welcome to Student Repository </h1>
<div id=links>
    <a href="/saveStudent">Add Student</a>
    <a href="/getPercentage">Get Percentage</a>
    <a href="/avgMarks">Get Percentage in Subject</a>
    <a href="/top2">Get top 2 Students</a>
</div>

</body>
</html>