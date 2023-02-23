<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

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
<body>

<h1> Average marks of Students in a subject</h1>
<form method="post">
    <input type="text" name="subject" placeholder="Subject Name">
    <br>
   
    <button>Submit</button>
</form>

</body>
</html>