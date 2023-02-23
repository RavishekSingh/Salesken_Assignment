<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    h2{
        text-align: center;
    }
    form{
        
        display: flex;
       
        height: 200px;
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
        width: 20%;
        height:250px;
        font-size: 25px;
    }
</style>
<body>


<h1>Click to get top 2 Students</h1>
<form method="post">
    
    <button>Submit</button>
</form>

</body>
</html>