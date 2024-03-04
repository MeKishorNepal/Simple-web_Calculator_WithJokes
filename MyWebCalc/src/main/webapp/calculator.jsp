
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <title>New Page</title>
        <style>
           
        
            img{
                height: 20%;
                width: 20%;
                margin-top: 20px;
                background-color:black;
            }
            img:hover{
                -ms-transform: scale(1.1);
                -webkit-transform: scale(1.1);
                transform: scale(1.1);
            }
            body{
                font-size: 40px;
                text-align: center;
                background-color:#2b40ff;
            }
            
            input, button{
                font-size: 40px;
                color:white;
                border-radius: 5%;
                background-color:black;
                border:2px solid white;
            }
             h1,h2,h3{
				color:white;
				
			}
		   .someclass{
			text-color:red;
			font-size:50px;
			background-color:white;
			
			
			
			}
            
        </style>
    </head>
    <body>
        <img src="E:\Images\giphy (1).gif">
        <h1>Joke, of  the Day!</h1>
         <h3><%=request.getAttribute("joke")%></h3>
        <form action="myServlet" method="post">

            <input name="num1" placeholder="First Number"></input>
            <input name="num2" placeholder="Second Number"></input>

            <button name="bt1" value="1">+</button>
            <button name="bt1" value="2">-</button>      
            <button name="bt1" value="3">*</button>
            <button name="bt1" value="4">/</button>
        </form>
        
        <h1>Ans=<%=request.getAttribute("Ans")%></h1>
        
        <form class="someclass">
        <a href="index.html" >Home</a> 
        
        </form>
        
       
        
    </body>
</html>

    