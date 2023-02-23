<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <style>
        form{
            border: 10px solid teal;
            display: flex;
            width: 20%;
            height: 300px;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            margin: auto;
        }
        h1{
            text-align: center;
            font-size: 55px;
        }
        form>input{
            width: 80%;
            height: 25px;
        }
        form>button{
            width: 82%;
            height: 25px;
        }
    </style>
  <h1>Average Percentage of whole class in recent semester</h1>
<form method="post">
  
    <input type="number" name="semester" placeholder="Enter Semester">
    <br>
  
    <button>Submit</button>
</form>

</body>
</html>